package leetcode.problem0128

import kotlin.math.max

class LongestConsecutiveSequence {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var maxLength = 0
        var sequenceLength = 1
        nums.sorted().distinct().reduce { prev, num ->
            if (num - prev == 1) {
                sequenceLength++
            } else {
                maxLength = max(maxLength, sequenceLength)
                sequenceLength = 1
            }
            num
        }
        return max(maxLength, sequenceLength)
    }
}
