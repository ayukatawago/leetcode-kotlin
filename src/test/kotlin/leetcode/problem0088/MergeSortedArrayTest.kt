package leetcode.problem0088

import kotlin.test.Test
import kotlin.test.assertEquals

internal class MergeSortedArrayTest {
    private val target = MergeSortedArray()

    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val nums2 = intArrayOf(2, 5, 6)
        target.merge(nums1, 3, nums2, 3)
        assertEquals(listOf(1, 2, 2, 3, 5, 6), nums1.toList())
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(1)
        val nums2 = intArrayOf()
        target.merge(nums1, 1, nums2, 0)
        assertEquals(listOf(1), nums1.toList())
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(0)
        val nums2 = intArrayOf(1)
        target.merge(nums1, 0, nums2, 1)
        assertEquals(listOf(1), nums1.toList())
    }

    @Test
    fun test4() {
        val nums1 = intArrayOf(0, 0, 3, 0, 0, 0, 0, 0, 0)
        val nums2 = intArrayOf(-1, 1, 1, 1, 2, 3)
        target.merge(nums1, 3, nums2, 6)
        assertEquals(listOf(-1, 0, 0, 1, 1, 1, 2, 3, 3), nums1.toList())
    }
}
