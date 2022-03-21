package leetcode.problem0005

import org.junit.Test
import kotlin.test.assertEquals

class LongestPalindromicSubstringTest {
    private val target = LongestPalindromicSubstring()

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
