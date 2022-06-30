package leetcode.problem0079

class WordSearch {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        val visitedArray = Array(board.size) { BooleanArray(board[0].size) { false } }
        board.forEachIndexed { row, chars ->
            chars.indices.forEach { column ->
                if (search(board, visitedArray, row, column, word)) {
                    return true
                }
            }
        }

        return false
    }

    private fun search(
        board: Array<CharArray>,
        visited: Array<BooleanArray>,
        row: Int,
        column: Int,
        word: String
    ): Boolean {
        if (word.isEmpty()) return true

        if (row < 0 || row > board.lastIndex || column < 0 || column > board[0].lastIndex ||
            board[row][column] != word.first() || visited[row][column]
        ) {
            return false
        }

        visited[row][column] = true
        if (search(board, visited, row - 1, column, word.drop(1)) ||
            search(board, visited, row + 1, column, word.drop(1)) ||
            search(board, visited, row, column - 1, word.drop(1)) ||
            search(board, visited, row, column + 1, word.drop(1))
        ) {
            return true
        }
        visited[row][column] = false
        return false
    }
}
