package leetcode.problem0120

import kotlin.math.min

class Triangle {
    fun minimumTotal(triangle: List<List<Int>>): Int =
        when (triangle.size) {
            1 -> triangle[0][0]
            else -> {
                val array = Array(triangle.size) { intArrayOf() }
                array[0] = intArrayOf(triangle[0][0])
                (1..triangle.lastIndex).forEach {
                    array[it] = IntArray(it + 1)
                    (0..array[it].lastIndex).forEach { index ->
                        array[it][index] = triangle[it][index] + when (index) {
                            0 -> array[it - 1][index]
                            array[it].lastIndex -> array[it - 1][index - 1]
                            else -> min(array[it - 1][index], array[it - 1][index - 1])
                        }
                    }
                }
                array[triangle.lastIndex].findMin()
            }
        }

    private fun IntArray.findMin(): Int {
        var minValue = this[0]
        for (i in 1..lastIndex) {
            val v = this[i]
            if (minValue > v) {
                minValue = v
            }
        }
        return minValue
    }
}
