package leetcode.problem0059

class SpiralMatrix2 {
    fun generateMatrix(n: Int): Array<IntArray> {
        val answer = Array(n) { IntArray(n) { 0 } }

        solve(answer, 0, 0, n, 1)

        return answer
    }

    private fun solve(answer: Array<IntArray>, row: Int, column: Int, size: Int, nextCount: Int) {
        if (size == 1) {
            answer[row][column] = nextCount
            return
        }

        var count = nextCount
        (0 until size - 1).forEach {
            answer[row][column + it] = count++
        }

        (0 until size - 1).forEach {
            answer[row + it][column + size - 1] = count++
        }

        (0 until size - 1).reversed().forEach {
            answer[row + size - 1][column + it + 1] = count++
        }

        (0 until size - 1).reversed().forEach {
            answer[row + it + 1][column] = count++
        }

        if (size > 2) {
            solve(answer, row + 1, column + 1, size - 2, count)
        }
    }
}
