package leetcode.problem0074

class Search2DMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        matrix.forEach {
            if (target < it.first() || it.last() < target) {
                return@forEach
            }

            var leftIndex = 0
            var rightIndex = it.lastIndex
            while (leftIndex <= rightIndex) {
                val center = (leftIndex + rightIndex) / 2
                when {
                    it[center] == target -> return true
                    it[center] > target -> rightIndex = center - 1
                    else -> leftIndex = center + 1
                }
            }
        }
        return false
    }
}
