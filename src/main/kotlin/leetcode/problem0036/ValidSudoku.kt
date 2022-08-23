package leetcode.problem0036

class ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        if (board.size != 9 || board[0].size != 9) {
            return false
        }

        val hashSet = HashSet<String>()

        board.forEachIndexed { rowIndex, row ->
            row.forEachIndexed forEachColumn@{ columnIndex, num ->
                if (num == '.') {
                    return@forEachColumn
                }

                if (!hashSet.add("$num in row $rowIndex") ||
                    !hashSet.add("$num in column $columnIndex") ||
                    !hashSet.add("$num in box ${rowIndex / 3}, ${columnIndex / 3}")
                ) {
                    return false
                }
            }
        }

        return true
    }
}
