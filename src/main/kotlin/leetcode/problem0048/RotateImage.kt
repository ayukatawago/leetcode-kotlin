package leetcode.problem0048

class RotateImage {
    fun rotate(matrix: Array<IntArray>) {
        transpose(matrix)
        reflect(matrix)
    }

    private fun transpose(matrix: Array<IntArray>) {
        matrix.indices.forEach { row ->
            (row + 1..matrix.lastIndex).forEach { column ->
                val tmp = matrix[row][column]
                matrix[row][column] = matrix[column][row]
                matrix[column][row] = tmp
            }
        }
    }

    private fun reflect(matrix: Array<IntArray>) {
        matrix.indices.forEach { row ->
            (0..matrix.lastIndex / 2).forEach { column ->
                val tmp = matrix[row][column]
                matrix[row][column] = matrix[row][matrix.lastIndex - column]
                matrix[row][matrix.lastIndex - column] = tmp
            }
        }
    }
}
