package leetcode.problem0031

class NextPermutation {
    fun nextPermutation(nums: IntArray) {
        if (nums.size == 1) {
            return
        }
        var indexToSwap = -1
        var index = nums.lastIndex
        while (index > 0) {
            if (nums[index - 1] < nums[index]) {
                indexToSwap = index - 1
                break
            }
            index--
        }

        if (indexToSwap != -1) {
            index = nums.lastIndex
            while (index > indexToSwap) {
                if (nums[index] > nums[indexToSwap]) {
                    val tmp = nums[index]
                    nums[index] = nums[indexToSwap]
                    nums[indexToSwap] = tmp
                    break
                }
                index--
            }
        }

        reverse(nums, indexToSwap + 1, nums.lastIndex)
    }

    private fun reverse(nums: IntArray, left: Int, right: Int) {
        var leftIndex = left
        var rightIndex = right
        while (leftIndex < rightIndex) {
            val tmp = nums[rightIndex]
            nums[rightIndex] = nums[leftIndex]
            nums[leftIndex] = tmp
            leftIndex++
            rightIndex--
        }
    }
}
