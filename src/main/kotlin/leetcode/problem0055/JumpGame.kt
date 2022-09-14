package leetcode.problem0055

import kotlin.math.max

class JumpGame {
    fun canJump(nums: IntArray): Boolean {
        var reachableIndex = 0

        nums.forEachIndexed { index, i ->
            if (index > reachableIndex) {
                return false
            }
            reachableIndex = max(reachableIndex, index + i)
        }
        return true
    }
}
