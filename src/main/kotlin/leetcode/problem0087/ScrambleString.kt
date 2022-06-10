package leetcode.problem0087

class ScrambleString {
    fun isScramble(s1: String, s2: String): Boolean {
        val resultMap = hashMapOf<Pair<String, String>, Boolean>()
        return isScramble(s1, s2, resultMap)
    }

    private fun isScramble(s1: String, s2: String, resultMap: HashMap<Pair<String, String>, Boolean>): Boolean {
        if (s1 == s2) {
            return true
        }
        if (resultMap.containsKey(s1 to s2)) {
            return resultMap[s1 to s2]!!
        }

        val s1Map = hashMapOf<Char, Int>()
        val s2Map = hashMapOf<Char, Int>()
        s1.forEach {
            val count = s1Map.getOrDefault(it, 0)
            s1Map[it] = count + 1
        }
        s2.forEach {
            val count = s2Map.getOrDefault(it, 0)
            s2Map[it] = count + 1
        }

        s1Map.forEach { entry ->
            if (s2Map.getOrDefault(entry.key, 0) != entry.value) {
                resultMap[s1 to s2] = false
                return false
            }
        }
        s1.indices.drop(1).forEach { index ->
            val s1Left = s1.substring(0, index)
            val s1Right = s1.substring(index)
            val s2Left = s2.substring(0, index)
            val s2Right = s2.substring(index)
            if (isScramble(s1Left, s2Left, resultMap) && isScramble(s1Right, s2Right, resultMap)) {
                resultMap[s1 to s2] = true
                return true
            }
            val s2SwappedLeft = s2.substring(s1.length - index)
            val s2SwappedRight = s2.substring(0, s1.length - index)
            if (isScramble(s1Left, s2SwappedLeft, resultMap) && isScramble(s1Right, s2SwappedRight, resultMap)) {
                resultMap[s1 to s2] = true
                return true
            }
        }
        resultMap[s1 to s2] = false
        return false
    }
}
