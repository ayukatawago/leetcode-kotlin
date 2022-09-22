package leetcode.problem0063

import kotlin.test.Test
import kotlin.test.assertEquals

internal class UniquePaths2Test {
    private val target = UniquePaths2()

    @Test
    fun test1() {
        val obstacleGrid = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 0)
        )
        assertEquals(2, target.uniquePathsWithObstacles(obstacleGrid))
    }

    @Test
    fun test2() {
        val obstacleGrid = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 0)
        )
        assertEquals(1, target.uniquePathsWithObstacles(obstacleGrid))
    }
}
