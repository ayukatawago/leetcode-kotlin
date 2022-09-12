package leetcode.problem0053

import kotlin.math.max

class MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        val answerArray = IntArray(nums.size) { 0 }
        var maxValue = Int.MIN_VALUE
        nums.forEachIndexed { index, num ->
            if (index == 0) {
                answerArray[index] = num
                maxValue = num
                return@forEachIndexed
            }
            answerArray[index] = max(answerArray[index - 1] + num, num)
            if (answerArray[index] > maxValue) {
                maxValue = answerArray[index]
            }
        }
        return maxValue
    }
}
