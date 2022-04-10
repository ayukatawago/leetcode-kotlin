package leetcode.problem0009

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeNumberTest {
    private val target = PalindromeNumber()

    @Test
    fun test_1() {
        assertTrue(target.isPalindrome(121))
    }

    @Test
    fun test_2() {
        assertFalse(target.isPalindrome(-121))
    }

    @Test
    fun test_3() {
        assertFalse(target.isPalindrome(10))
    }
}
