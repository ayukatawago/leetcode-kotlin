package leetcode.problem0045

import kotlin.math.min

class JumpGame2 {
    fun jump(nums: IntArray): Int {
        val answer = IntArray(nums.size) { Int.MAX_VALUE }

        answer[0] = 0
        nums.dropLast(1).forEachIndexed { index, i ->
            (1..i).forEach {
                if (index + it > nums.lastIndex) return@forEach
                answer[index + it] = min(answer[index + it], answer[index] + 1)
            }
        }
        return answer[nums.lastIndex]
    }
}
