package `0005-longest-palindromic-substring`

import kotlin.math.max

class Solution0005 {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) {
            return ""
        }
        var startIndex = 0
        var endIndex = 0

        for (index in 0..s.length) {
            val temp1 = findPalindrome(s, index, index)
            val temp2 = findPalindrome(s, index, index + 1)
            val maxPalindromeLength = max(temp1, temp2)
            if (maxPalindromeLength > endIndex - startIndex) {
                startIndex = index - (maxPalindromeLength - 1) / 2
                endIndex = index + maxPalindromeLength / 2 + 1
            }
        }
        return s.substring(startIndex, endIndex)
    }

    private fun findPalindrome(s: String, start: Int, end: Int): Int {
        var length = end - start
        for (index in 0..s.length) {
            if (start - index < 0 || end + index >= s.length || s[start - index] != s[end + index]) {
                break
            }
            length += 2
        }
        return length - 1
    }
}
