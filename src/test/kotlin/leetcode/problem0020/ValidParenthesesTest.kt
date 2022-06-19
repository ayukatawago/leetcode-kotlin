package leetcode.problem0020

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class ValidParenthesesTest {
    private val target = ValidParentheses()

    @Test
    fun test1() {
        assertTrue(target.isValid("()"))
    }

    @Test
    fun test2() {
        assertTrue(target.isValid("()[]{}"))
    }

    @Test
    fun test3() {
        assertFalse(target.isValid("(]"))
    }

    @Test
    fun test4() {
        assertFalse(target.isValid("["))
    }

    @Test
    fun test5() {
        assertFalse(target.isValid("]"))
    }
}
