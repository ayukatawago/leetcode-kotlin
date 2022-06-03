package leetcode.problem0084

import java.util.Stack
import kotlin.math.max

class LargestRectangleInHistogram {
    fun largestRectangleArea(heights: IntArray): Int {
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
