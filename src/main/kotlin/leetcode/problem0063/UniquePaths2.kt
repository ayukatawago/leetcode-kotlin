package leetcode.problem0063

class UniquePaths2 {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val m = obstacleGrid.size
        val n = obstacleGrid[0].size
        val array = Array(m) { IntArray(n) { 0 } }

        var isBlocked = false
        (0 until m).forEach {
            array[it][0] = if (obstacleGrid[it][0] == 1 || isBlocked) {
                isBlocked = true
                0
            } else {
                1
            }
        }

        isBlocked = false
        (0 until n).forEach {
            array[0][it] = if (obstacleGrid[0][it] == 1 || isBlocked) {
                isBlocked = true
                0
            } else {
                1
            }
        }

        (1 until m).forEach { row ->
            (1 until n).forEach { column ->
                array[row][column] = if (obstacleGrid[row][column] == 1) {
                    0
                } else {
                    array[row - 1][column] + array[row][column - 1]
                }
            }
        }
        return array[m - 1][n - 1]
    }
}
