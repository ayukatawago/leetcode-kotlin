package leetcode.problem0035

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.last() < target) {
            return nums.size
        }

        if (nums.first() > target) {
            return 0
        }

        var left = 0
        var right = nums.size - 1
        var center = 0

        while (left <= right) {
            center = (left + right) / 2
            when {
                nums[center] == target -> return center
                nums[center] < target && target < nums[center + 1] -> return center + 1
                target < nums[center] -> right = center
                else -> left = center + 1
            }
        }
        return center
    }
}
