package leetcode.problem0062

class UniquePaths {
    fun uniquePaths(m: Int, n: Int): Int {
        val array = Array(m) { IntArray(n) { 0 } }
        (0 until m).forEach {
            array[it][0] = 1
        }
        (0 until n).forEach {
            array[0][it] = 1
        }

        (1 until m).forEach { row ->
            (1 until n).forEach { column ->
                array[row][column] = array[row - 1][column] + array[row][column - 1]
            }
        }

        return array[m - 1][n - 1]
    }
}
