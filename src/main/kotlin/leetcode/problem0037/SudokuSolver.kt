package leetcode.problem0037

class SudokuSolver {
    fun solveSudoku(board: Array<CharArray>) {
        solve(board)
    }

    private fun solve(board: Array<CharArray>): Boolean {
        board.forEachIndexed { rowIndex, row ->
            row.forEachIndexed columnLoop@{ columnIndex, _ ->
                if (board[rowIndex][columnIndex] != '.') return@columnLoop

                CHARSETS.forEach {
                    if (canInsert(board, rowIndex, columnIndex, it)) {
                        board[rowIndex][columnIndex] = it
                        if (solve(board)) {
                            return true
                        } else {
                            board[rowIndex][columnIndex] = '.'
                        }
                    }
                }

                return false
            }
        }
        return true
    }

    private fun canInsert(board: Array<CharArray>, row: Int, column: Int, value: Char): Boolean {
        board.indices.forEach {
            if (board[row][it] == value) {
                return false
            }
            if (board[it][column] == value) {
                return false
            }
            if (board[3 * (row / 3) + it / 3][3 * (column / 3) + it % 3] == value) {
                return false
            }
        }
        return true
    }

    companion object {
        private val CHARSETS: List<Char> = listOf('1', '2', '3', '4', '5', '6', '7', '8', '9')
    }
}
