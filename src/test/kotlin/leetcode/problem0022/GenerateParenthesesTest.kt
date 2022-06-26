package leetcode.problem0022

import kotlin.test.Test
import kotlin.test.assertEquals

internal class GenerateParenthesesTest {
    private val target = GenerateParentheses()

    @Test
    fun test1() {
        assertEquals(
            listOf("((()))", "(()())", "(())()", "()(())", "()()()").sorted(),
            target.generateParenthesis(3).sorted()
        )
    }

    @Test
    fun test2() {
        assertEquals(
            listOf("()"),
            target.generateParenthesis(1)
        )
    }

    @Test
    fun test3() {
        assertEquals(
            listOf(
                "(((())))",
                "((()()))",
                "((())())",
                "((()))()",
                "(()(()))",
                "(()()())",
                "(()())()",
                "(())(())",
                "(())()()",
                "()((()))",
                "()(()())",
                "()(())()",
                "()()(())",
                "()()()()"
            ).sorted(),
            target.generateParenthesis(4).sorted()
        )
    }
}
