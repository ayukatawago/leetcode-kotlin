package leetcode.problem0080

class RemoveDuplicatesFromSortedArray2 {
    fun removeDuplicates(nums: IntArray): Int {
        var pointerIndex = 0
        var count = 0
        var tmpValue = Int.MAX_VALUE
        nums.forEach {
            when {
                it != tmpValue -> {
                    count = 0
                    tmpValue = it
                    nums[pointerIndex] = it
                    pointerIndex++
                }
                count == 0 -> {
                    count++
                    nums[pointerIndex] = it
                    pointerIndex++
                }
                else -> Unit
            }
        }
        return pointerIndex
    }
}
