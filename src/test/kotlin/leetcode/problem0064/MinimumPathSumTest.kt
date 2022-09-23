package leetcode.problem0064

import kotlin.test.Test
import kotlin.test.assertEquals

internal class MinimumPathSumTest {
    private val target = MinimumPathSum()

    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(1, 3, 1),
            intArrayOf(1, 5, 1),
            intArrayOf(4, 2, 1)
        )
        assertEquals(7, target.minPathSum(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6)
        )
        assertEquals(12, target.minPathSum(grid))
    }
}
