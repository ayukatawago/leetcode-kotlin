package leetcode.problem0049

class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hashMap = HashMap<String, MutableList<String>>()
        strs.forEach {
            val key = it.toCharArray().sorted().joinToString("")
            if (hashMap.containsKey(key)) {
                requireNotNull(hashMap[key]).add(it)
            } else {
                hashMap[key] = mutableListOf(it)
            }
        }
        return hashMap.values.toList()
    }
}
