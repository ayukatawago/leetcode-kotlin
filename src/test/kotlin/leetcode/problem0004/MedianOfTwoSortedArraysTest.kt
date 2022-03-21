package leetcode.problem0004

import org.junit.Test
import kotlin.test.assertEquals

class MedianOfTwoSortedArraysTest {
    private val target = MedianOfTwoSortedArrays()

    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 3)
        val nums2 = intArrayOf(2)
        assertEquals(2.0, target.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(1, 3)
        val nums2 = intArrayOf(2, 4)
        assertEquals(2.5, target.findMedianSortedArrays(nums1, nums2))
    }

    @Test
    fun test3() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(3, 4)
        assertEquals(2.5, target.findMedianSortedArrays(nums1, nums2))
    }
}
