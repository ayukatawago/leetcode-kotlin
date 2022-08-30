package leetcode.problem0042

class TrappingRainWater {
    fun trap(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var answer = 0
        var leftMax = 0
        var rightMax = 0
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]
                } else {
                    answer += leftMax - height[left]
                }
                left++
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]
                } else {
                    answer += rightMax - height[right]
                }
                right--
            }
        }

        return answer
    }
}
