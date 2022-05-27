package leetcode.problem0088

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        val deque = ArrayDeque<Int>()
        var index1 = 0
        var index2 = 0
        while (index1 < m + n) {
            when {
                index2 == n -> {
                    deque.add(nums1[index1])
                    nums1[index1++] = deque.removeFirst()
                }
                index1 >= m -> {
                    nums1[index1++] = if (deque.isNotEmpty() && deque.first() <= nums2[index2]) {
                        deque.removeFirst()
                    } else {
                        nums2[index2++]
                    }
                }
                deque.isNotEmpty() && deque.first() <= nums2[index2] -> {
                    deque.add(nums1[index1])
                    nums1[index1++] = deque.removeFirst()
                }
                nums1[index1] > nums2[index2] -> {
                    deque.add(nums1[index1])
                    nums1[index1++] = nums2[index2++]
                }
                else -> index1++
            }
        }
    }
}
