package leetcode.problem0004

class MedianOfTwoSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val length = nums1.size + nums2.size
        val shouldHandleEvenArray = length % 2 == 0
        val median = length / 2
        val mergedIntArray = IntArray(median + 1) { 0 }
        var pointer1 = 0
        var pointer2 = 0
        var index = 0

        while (index < median + 1) {
            mergedIntArray[index++] = when {
                pointer1 == nums1.size -> nums2[pointer2++]
                pointer2 == nums2.size -> nums1[pointer1++]
                nums1[pointer1] <= nums2[pointer2] -> nums1[pointer1++]
                else -> nums2[pointer2++]
            }
        }
        return if (shouldHandleEvenArray) {
            (mergedIntArray[median - 1].toDouble() + mergedIntArray[median].toDouble()) / 2
        } else {
            mergedIntArray[median].toDouble()
        }
    }
}
