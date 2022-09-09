package leetcode.problem0052

class NQueens2 {
    fun totalNQueens(n: Int): Int {
        val board = Array(n) { BooleanArray(n) { false } }

        return solve(board, 0)
    }

    private fun solve(board: Array<BooleanArray>, row: Int): Int {
        if (row == board.size) {
            return 1
        }
        var count = 0

        board[row].indices.forEach { column ->
            if (canPlace(board, row, column)) {
                board[row][column] = true
                count += solve(board, row + 1)
                board[row][column] = false
            }
        }
        return count
    }

    private fun canPlace(board: Array<BooleanArray>, row: Int, column: Int): Boolean {
        if (board[row].any { it }) {
            return false
        }
        if (board.map { it[column] }.any { it }) {
            return false
        }
        val leftDiagonal = (0 until row).mapNotNull {
            val diff = column - row
            if (it + diff >= 0 && it + diff <= board.lastIndex) board[it][it + diff] else null
        }
        if (leftDiagonal.any { it }) {
            return false
        }
        val rightDiagonal = (0 until row).mapNotNull {
            val sum = row + column
            if (it <= sum && sum - it <= board.lastIndex) board[it][sum - it] else null
        }
        if (rightDiagonal.any { it }) {
            return false
        }
        return true
    }
}
