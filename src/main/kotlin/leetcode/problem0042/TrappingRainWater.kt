package leetcode.problem0042

import java.util.Stack
import kotlin.math.min

class TrappingRainWater {
    fun trap(height: IntArray): Int {
        var answer = 0
        val stack = Stack<Int>()
        height.forEachIndexed { index, i ->
            while (stack.isNotEmpty() && i > height[stack.peek()]) {
                val bottomIndex = stack.pop()
                if (stack.isEmpty()) {
                    break
                }

                val distance = index - stack.peek() - 1
                val boundedHeight = min(i, height[stack.peek()]) - height[bottomIndex]
                answer += distance * boundedHeight
            }
            stack.push(index)
        }

        return answer
    }
}
