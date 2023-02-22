package leetcode.problem0132

import kotlin.math.min

class PalindromePartitioning2 {
    fun minCut(s: String): Int {
        if (s.isPalindrome()) return 0

        val palindromeArray = IntArray(s.length + 1) { 0 }

        s.indices.forEach { endIndex ->
            if (s.slice(0..endIndex).isPalindrome()) return@forEach

            var minCuts = s.length
            (0..endIndex).forEach { startIndex ->
                if (s.slice(startIndex..endIndex).isPalindrome()) {
                    minCuts = min(minCuts, palindromeArray[startIndex])
                }
            }
            palindromeArray[endIndex + 1] = 1 + minCuts
        }

        return palindromeArray[s.length]
    }

    private fun String.isPalindrome(): Boolean =
        this == this.reversed()
}
