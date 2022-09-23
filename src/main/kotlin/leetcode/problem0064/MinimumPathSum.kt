package leetcode.problem0064

import kotlin.math.min

class MinimumPathSum {
    fun minPathSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val minPathArray = Array(m) { IntArray(n) { 0 } }

        minPathArray[0][0] = grid[0][0]

        (1 until m).forEach {
            minPathArray[it][0] = minPathArray[it - 1][0] + grid[it][0]
        }

        (1 until n).forEach {
            minPathArray[0][it] = minPathArray[0][it - 1] + grid[0][it]
        }

        (1 until m).forEach { row ->
            (1 until n).forEach { column ->
                minPathArray[row][column] =
                    grid[row][column] + min(minPathArray[row - 1][column], minPathArray[row][column - 1])
            }
        }

        return minPathArray[m - 1][n - 1]
    }
}
