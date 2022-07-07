package leetcode.problem0073

class SetMatrixZeroes {
    fun setZeroes(matrix: Array<IntArray>) {
        var shouldClearFirstColumns = false
        var shouldClearFirstRows = false

        matrix.forEachIndexed { row, it ->
            it.forEachIndexed columnLoop@ { column, i ->
                if (row == 0 && i == 0) {
                    shouldClearFirstRows = true
                }
                if (column == 0 && i == 0) {
                    shouldClearFirstColumns = true
                }

                if (row == 0 || column == 0) return@columnLoop

                if (i == 0) {
                    matrix[row][0] = 0
                    matrix[0][column] = 0
                }
            }
        }

        matrix.forEachIndexed { row, it ->
            it.forEachIndexed columnLoop@{ column, i ->
                if (i == 0 || row == 0 || column == 0) return@columnLoop
                if (matrix[row][0] == 0 || matrix[0][column] == 0) {
                    matrix[row][column] = 0
                }
            }
        }

        if (shouldClearFirstRows) {
            matrix[0].indices.forEach {
                matrix[0][it] = 0
            }
        }

        if (shouldClearFirstColumns) {
            matrix.indices.forEach {
                matrix[it][0] = 0
            }
        }
    }
}
