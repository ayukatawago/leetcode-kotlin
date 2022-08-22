package leetcode.problem0034

class FindFirstAndLastPositionOfElementInSortedArray {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty()) {
            return intArrayOf(-1, -1)
        }

        var left = 0
        var right = nums.lastIndex
        if (target < nums[left] || nums[right] < target) {
            return intArrayOf(-1, -1)
        }

        var start = -1
        var end = -1

        while (left <= right) {
            val center = (left + right) / 2
            when {
                nums[center] == target -> {
                    start = center
                    right = center - 1
                }
                target < nums[center] -> right = center - 1
                else -> left = center + 1
            }
        }

        left = 0
        right = nums.lastIndex

        while (left <= right) {
            val center = (left + right) / 2
            when {
                nums[center] == target -> {
                    end = center
                    left = center + 1
                }
                target < nums[center] -> right = center - 1
                else -> left = center + 1
            }
        }

        return intArrayOf(start, end)
    }
}
