package leetcode.problem0026

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var pointer = 0
        nums.indices.forEach {
            if (nums[pointer] != nums[it]) {
                pointer++
                nums[pointer] = nums[it]
            }
        }
        return pointer + 1
    }
}
