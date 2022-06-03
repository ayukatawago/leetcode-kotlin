package leetcode.problem0085

import kotlin.test.Test
import kotlin.test.assertEquals

internal class MaximalRectangleTest {
    private val target = MaximalRectangle()

    @Test
    fun test1() {
        val matrix = arrayOf(
            charArrayOf('1', '0', '1', '0', '0'),
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '0', '0', '1', '0')
        )
        assertEquals(6, target.maximalRectangle(matrix))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(charArrayOf('0'))
        assertEquals(0, target.maximalRectangle(matrix))
    }

    @Test
    fun test3() {
        val matrix = arrayOf(charArrayOf('1'))
        assertEquals(1, target.maximalRectangle(matrix))
    }
}
