package leetcode.problem0016

import kotlin.math.abs

class ThreeSumClosest {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        val sortedNums = nums.sorted()
        var closest = Int.MAX_VALUE
        var answer = 0
        sortedNums.forEachIndexed { index, num ->
            val remainings = sortedNums.drop(index + 1)
            if (remainings.size <= 1) {
                return@forEachIndexed
            }
            var left = 0
            var right = remainings.size - 1
            while (left < right) {
                val sum = num + remainings[left] + remainings[right]
                if (closest > abs(sum - target)) {
                    closest = abs(sum - target)
                    answer = sum
                    println("$closest <- $sum ($num, ${remainings[left]}, ${remainings[right]})")
                }
                if (sum > target) {
                    right--
                } else {
                    left++
                }
            }
        }
        return answer
    }
}
