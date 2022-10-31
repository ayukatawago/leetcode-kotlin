package leetcode.problem0091

class DecodeWays {
    fun numDecodings(s: String): Int {
        val countMap = hashMapOf<String, Int>()
        return numDecodings(s, countMap)
    }

    private fun numDecodings(s: String, countMap: HashMap<String, Int>): Int {
        if (countMap.containsKey(s)) {
            return requireNotNull(countMap[s])
        }

        val count = if (s.length == 1) {
            if (s[0] == '0') 0 else 1
        } else {
            val head = s.slice(0..1)
            when {
                head.startsWith('0') -> 0
                head.toInt() in 10..26 -> {
                    val remaining = if (s.length > 2) numDecodings(s.drop(2), countMap) else 1
                    numDecodings(s.drop(1), countMap) + remaining
                }
                else -> numDecodings(s.drop(1), countMap)
            }
        }
        countMap[s] = count
        return count
    }
}
