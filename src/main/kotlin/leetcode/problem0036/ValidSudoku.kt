package leetcode.problem0036

class ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        if (board.size != 9 || board[0].size != 9) {
            return false
        }

        // Check column
        board.forEach forEachRow@{ row ->
            if (!hasValidList(row.toList())) {
                return false
            }
        }

        // Check row
        board[0].indices.forEach { index ->
            val column = board.map { it[index] }
            if (!hasValidList(column)) {
                return false
            }
        }

        // Check box
        BOX_INDEX.forEach { row ->
            BOX_INDEX.forEach { column ->
                val box = listOf(
                    board[row][column],
                    board[row][column + 1],
                    board[row][column + 2],
                    board[row + 1][column],
                    board[row + 1][column + 1],
                    board[row + 1][column + 2],
                    board[row + 2][column],
                    board[row + 2][column + 1],
                    board[row + 2][column + 2]
                )
                if (!hasValidList(box)) {
                    return false
                }
            }
        }

        return true
    }

    private fun hasValidList(input: List<Char>): Boolean {
        val tmpSet = mutableSetOf<Char>()
        input.forEach {
            if (it == '.') {
                return@forEach
            }
            if (it in tmpSet) {
                return false
            }
            tmpSet.add(it)
        }
        return true
    }

    companion object {
        private val BOX_INDEX = listOf(0, 3, 6)
    }
}
