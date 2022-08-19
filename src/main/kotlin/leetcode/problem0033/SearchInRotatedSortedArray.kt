package leetcode.problem0033

class SearchInRotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val center = (left + right) / 2

            when {
                nums[center] == target -> return center
                nums[left] <= nums[center] -> {
                    when {
                        target < nums[left] -> left = center + 1
                        target < nums[center] -> right = center - 1
                        else -> left = center + 1
                    }
                }
                else -> {
                    if (nums[left] == target) {
                        return left
                    } else {
                        left++
                    }
                }
            }
        }
        return -1
    }
}
