package `0005-longest-palindromic-substring`

class Solution0005 {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) {
            return ""
        }
        var temp = s[0].toString()

        for (index in 0..s.length) {
            temp = findLongerPalindrome(s.substring(index), temp)
        }
        return temp
    }

    private fun findLongerPalindrome(s: String, currentPalindrome: String): String {
        if (s.length < currentPalindrome.length) {
            return currentPalindrome
        }
        var temp = currentPalindrome
        for (subLength in 0..s.length) {
            val substring = s.substring(0, s.length - subLength)
            if (temp.length >= substring.length) {
                break
            }
            if (isPalindromic(substring)) {
                temp = substring
            }
        }
        return temp
    }

    private fun isPalindromic(s: String): Boolean {
        val palindromicSize = s.length / 2
        for (i in 0..palindromicSize) {
            if (s[i] != s[s.length - 1 - i]) {
                return false
            }
        }
        return true
    }
}
