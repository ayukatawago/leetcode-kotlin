package `0005-longest-palindromic-substring`

import org.junit.Test
import kotlin.test.assertEquals

class Solution0005Test {
    private val target = Solution0005()

    @Test
    fun test1() {
        val input = "babad"
        val output = "bab"
        assertEquals(output, target.longestPalindrome(input))
    }

    @Test
    fun test2() {
        val input = "cbbd"
        val output = "bb"
        assertEquals(output, target.longestPalindrome(input))
    }
}
