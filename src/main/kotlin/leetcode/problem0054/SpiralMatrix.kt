package leetcode.problem0054

class SpiralMatrix {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        return spiralOrderHelper(matrix.map { it.toList() })
    }

    private fun spiralOrderHelper(matrix: List<List<Int>>): MutableList<Int> {
        if (matrix[0].isEmpty()) {
            return mutableListOf()
        }

        val answerList = mutableListOf<Int>()

        when (matrix.size) {
            1 -> answerList.addAll(matrix[0].toList())
            2 -> {
                answerList.addAll(matrix[0])
                answerList.addAll(matrix[1].reversed())
            }
            else -> {
                val end = matrix[0].lastIndex
                if (end == 0) {
                    answerList.addAll(matrix.map { it[0] })
                } else {
                    answerList.addAll(matrix[0].dropLast(1))
                    answerList.addAll(matrix.map { it[end] })
                    answerList.addAll(matrix[matrix.lastIndex].dropLast(1).reversed())
                    answerList.addAll(matrix.map { it[0] }.reversed().drop(1).dropLast(1))
                    val newMatrix = matrix.slice(1 until matrix.lastIndex).map { it.drop(1).dropLast(1) }
                    answerList.addAll(spiralOrderHelper(newMatrix))
                }
            }
        }

        return answerList
    }
}
