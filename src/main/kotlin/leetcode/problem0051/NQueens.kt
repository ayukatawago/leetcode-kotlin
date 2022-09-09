package leetcode.problem0051

class NQueens {
    fun solveNQueens(n: Int): List<List<String>> {
        val answer = arrayListOf<List<String>>()

        val board = Array(n) { CharArray(n) { '.' } }

        solve(board, 0, answer)

        return answer
    }

    private fun solve(board: Array<CharArray>, row: Int, answer: ArrayList<List<String>>) {
        if (row == board.size) {
            answer.add(board.map { it.joinToString("") })
            return
        }

        board[row].indices.forEach { column ->
            if (canPlace(board, row, column)) {
                board[row][column] = 'Q'
                solve(board, row + 1, answer)
                board[row][column] = '.'
            }
        }
    }

    private fun canPlace(board: Array<CharArray>, row: Int, column: Int): Boolean {
        if ('Q' in board[row]) {
            return false
        }
        if ('Q' in board.map { it[column] }) {
            return false
        }
        val leftDiagonal = (0 until row).mapNotNull {
            val diff = column - row
            if (it + diff >= 0 && it + diff <= board.lastIndex) board[it][it + diff] else null
        }
        if ('Q' in leftDiagonal) {
            return false
        }
        val rightDiagonal = (0 until row).mapNotNull {
            val sum = row + column
            if (it <= sum && sum - it <= board.lastIndex) board[it][sum - it] else null
        }
        if ('Q' in rightDiagonal) {
            return false
        }
        return true
    }
}
