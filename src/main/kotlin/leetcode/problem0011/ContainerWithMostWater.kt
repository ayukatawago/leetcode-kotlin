package leetcode.problem0011

import kotlin.math.min

class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex

        var maxAmount = 0
        while (left < right) {
            val amount = min(height[left], height[right]) * (right - left)
            if (amount > maxAmount) {
                maxAmount = amount
                println(maxAmount)
            }
            if (height[left] > height[right]) {
                right--
            } else {
                left++
            }
        }
        return maxAmount
    }
}
