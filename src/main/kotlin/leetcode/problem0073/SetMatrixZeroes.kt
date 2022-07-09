package leetcode.problem0073

class SetMatrixZeroes {
    fun setZeroes(matrix: Array<IntArray>) {
        val rows = mutableSetOf<Int>()
        val columns = mutableSetOf<Int>()
        matrix.forEachIndexed { row, it ->
            it.forEachIndexed { column, i ->
                if (i == 0) {
                    rows.add(row)
                    columns.add(column)
                }
            }
        }

        matrix.forEachIndexed { row, it ->
            it.forEachIndexed columnLoop@{ column, i ->
                if (i == 0) return@columnLoop
                if (rows.contains(row) || columns.contains(column)) {
                    matrix[row][column] = 0
                }
            }
        }
    }
}
