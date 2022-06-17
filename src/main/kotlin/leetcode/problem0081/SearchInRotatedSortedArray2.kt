package leetcode.problem0081

class SearchInRotatedSortedArray2 {
    fun search(nums: IntArray, target: Int): Boolean {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val center = (left + right) / 2

            if (nums[center] == target) {
                return true
            }

            when {
                nums[center] == target -> return true
                nums[left] == nums[center] -> left++
                (nums[left] <= nums[center]) xor (nums[left] <= target) -> {
                    if (nums[left] <= nums[center]) {
                        left = center + 1
                    } else {
                        right = center - 1
                    }
                }
                else -> {
                    if (nums[center] <= target) {
                        left = center + 1
                    } else {
                        right = center - 1
                    }
                }
            }
        }
        return false
    }
}
