package leetcode.problem0131

class PalindromePartitioning {
    fun partition(s: String): List<List<String>> {
        if (s.isEmpty()) return emptyList()

        val answer = mutableListOf<List<String>>()
        (0..s.lastIndex).forEach { index ->
            val headString = s.slice(0..index)
            if (headString.isNotEmpty() && headString.isPalindrome()) {
                if (index < s.lastIndex) {
                    partition(s.drop(index + 1)).forEach {
                        answer.add(listOf(headString) + it)
                    }
                } else {
                    answer.add(listOf(headString))
                }
            }
        }
        return answer
    }

    private fun String.isPalindrome(): Boolean =
        this == this.reversed()
}
