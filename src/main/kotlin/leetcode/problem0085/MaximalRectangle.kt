package leetcode.problem0085

import java.util.Stack
import kotlin.math.max

class MaximalRectangle {
    fun maximalRectangle(matrix: Array<CharArray>): Int {
        val heights = Array(matrix.size) { IntArray(matrix[0].size) { 0 } }

        matrix.forEachIndexed { row, chars ->
            chars.indices.forEach { column ->
                heights[row][column] = when (matrix[row][column]) {
                    '1' -> if (row == 0) 1 else heights[row - 1][column] + 1
                    '0' -> 0
                    else -> error("Invalid value")
                }
            }
        }

        var maxSize = 0

        heights.forEach {
            maxSize = max(maxSize, largestRectangleArea(it))
        }

        return maxSize
    }

    private fun largestRectangleArea(heights: IntArray): Int {
        val indexStack = Stack<Int>()
        var maxArea = 0

        heights.forEachIndexed { index, i ->
            while (indexStack.isNotEmpty() && i < heights[indexStack.peek()]) {
                val currentIndex = indexStack.pop()
                val nextIndex = if (indexStack.isEmpty()) 0 else indexStack.peek() + 1
                val area = heights[currentIndex] * (index - nextIndex)
                maxArea = max(maxArea, area)
            }

            indexStack.push(index)
        }

        while (indexStack.isNotEmpty()) {
            val currentIndex = indexStack.pop()
            val nextIndex = if (indexStack.isEmpty()) 0 else indexStack.peek() + 1
            val area = heights[currentIndex] * (heights.size - nextIndex)
            maxArea = max(maxArea, area)
        }

        return maxArea
    }
}
