package leetcode.problem0028

class ImplementStrStr {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }

        haystack.forEachIndexed { index, _ ->
            if (haystack.drop(index).startsWith(needle)) {
                return index
            }
        }

        return -1
    }
}
