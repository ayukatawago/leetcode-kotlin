package leetcode.problem0032

import kotlin.test.Test
import kotlin.test.assertEquals

internal class LongestValidParenthesesTest {
    private val target = LongestValidParentheses()

    @Test
    fun test1() {
        assertEquals(2, target.longestValidParentheses("(()"))
    }

    @Test
    fun test2() {
        assertEquals(4, target.longestValidParentheses(")()())"))
    }

    @Test
    fun test3() {
        assertEquals(0, target.longestValidParentheses(""))
    }

    @Test
    fun test4() {
        assertEquals(4, target.longestValidParentheses("(()))"))
    }

    @Test
    fun test5() {
        assertEquals(6, target.longestValidParentheses("(()))()()()"))
    }

    @Test
    fun test6() {
        assertEquals(2, target.longestValidParentheses("()(()"))
    }
}
