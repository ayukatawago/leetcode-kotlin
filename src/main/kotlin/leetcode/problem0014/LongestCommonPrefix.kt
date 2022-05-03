package leetcode.problem0014

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = strs[0]
        strs.drop(1).forEach {
            while (prefix.isNotEmpty()) {
                if (it.startsWith(prefix)) {
                    return@forEach
                }
                prefix = prefix.dropLast(1)
            }
        }
        return prefix
    }
}
