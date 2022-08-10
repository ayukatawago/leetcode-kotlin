package leetcode.problem0035

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SearchInsertPositionTest {
    private val target = SearchInsertPosition()

    @Test
    fun test1() {
        assertEquals(2, target.searchInsert(intArrayOf(1, 3, 5, 6), 5))
    }

    @Test
    fun test2() {
        assertEquals(1, target.searchInsert(intArrayOf(1, 3, 5, 6), 2))
    }

    @Test
    fun test3() {
        assertEquals(4, target.searchInsert(intArrayOf(1, 3, 5, 6), 7))
    }
}
