package leetcode.problem0130

class SurroundedRegions {
    fun solve(board: Array<CharArray>) {
        val rowSize = board.size
        val columnSize = board[0].size

        (0 until rowSize).forEach { row ->
            if (board[row][0] != 'X')
                markNotSurroundedX(row, 0, board)
            if (board[row][columnSize - 1] != 'X')
                markNotSurroundedX(row, columnSize - 1, board)
        }
        (0 until columnSize).forEach { column ->
            if (board[0][column] != 'X')
                markNotSurroundedX(0, column, board)
            if (board[rowSize - 1][column] != 'X')
                markNotSurroundedX(rowSize - 1, column, board)
        }

        // Flip surrounded 'X'
        (0 until rowSize).forEach { row ->
            (0 until columnSize).forEach { column ->
                if (board[row][column] == 'O') {
                    board[row][column] = 'X'
                }
            }
        }

        // Revert not surrounded 'X'
        (0 until rowSize).forEach { row ->
            (0 until columnSize).forEach { column ->
                if (board[row][column] == ' ') {
                    board[row][column] = 'O'
                }
            }
        }
    }

    private fun markNotSurroundedX(row: Int, column: Int, board: Array<CharArray>) {
        if (row < 0 || row >= board.size || column < 0 || column >= board[0].size || board[row][column] != 'O') return

        board[row][column] = ' '
        markNotSurroundedX(row + 1, column, board)
        markNotSurroundedX(row, column + 1, board)
        markNotSurroundedX(row - 1, column, board)
        markNotSurroundedX(row, column - 1, board)
    }
}
