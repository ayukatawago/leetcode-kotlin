package leetcode.problem0034

import kotlin.test.Test
import kotlin.test.assertEquals

internal class FindFirstAndLastPositionOfElementInSortedArrayTest {
    private val target = FindFirstAndLastPositionOfElementInSortedArray()

    @Test
    fun test1() {
        assertEquals(
            listOf(3, 4),
            target.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8).toList()
        )
    }

    @Test
    fun test2() {
        assertEquals(
            listOf(-1, -1),
            target.searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6).toList()
        )
    }

    @Test
    fun test3() {
        assertEquals(
            listOf(-1, -1),
            target.searchRange(intArrayOf(), 0).toList()
        )
    }
}
