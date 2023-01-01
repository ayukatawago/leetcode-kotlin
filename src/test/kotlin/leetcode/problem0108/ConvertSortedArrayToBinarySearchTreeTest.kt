package leetcode.problem0108

import kotlin.test.Test
import kotlin.test.assertEquals

class ConvertSortedArrayToBinarySearchTreeTest {
    private val target = ConvertSortedArrayToBinarySearchTree()

    @Test
    fun test1() {
        val nums = intArrayOf(-10, -3, 0, 5, 9)
        assertEquals(
            listOf(0, -3, 9, -10, null, 5),
            target.sortedArrayToBST(nums)?.toList()
        )
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 3)
        assertEquals(
            listOf(3, 1),
            target.sortedArrayToBST(nums)?.toList()
        )
    }
}
