package leetcode.problem0125

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidPalindromeTest {
    private val target = ValidPalindrome()

    @Test
    fun test1() {
        assertTrue(target.isPalindrome("A man, a plan, a canal: Panama"))
    }

    @Test
    fun test2() {
        assertFalse(target.isPalindrome("race a car"))
    }

    @Test
    fun test3() {
        assertTrue(target.isPalindrome(" "))
    }

    @Test
    fun test4() {
        assertTrue(target.isPalindrome("a"))
        assertFalse(target.isPalindrome("0P"))
    }
}
