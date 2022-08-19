package leetcode.problem0033

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SearchInRotatedSortedArrayTest {
    private val target = SearchInRotatedSortedArray()

    @Test
    fun test1() {
        assertEquals(4, target.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0))
    }

    @Test
    fun test2() {
        assertEquals(-1, target.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3))
    }

    @Test
    fun test3() {
        assertEquals(-1, target.search(intArrayOf(1), 0))
    }

    @Test
    fun test4() {
        assertEquals(1, target.search(intArrayOf(1, 3), 3))
    }

    @Test
    fun test5() {
        assertEquals(0, target.search(intArrayOf(3, 5, 1), 3))
    }

    @Test
    fun test6() {
        assertEquals(2, target.search(intArrayOf(5, 1, 3), 3))
    }

    @Test
    fun test7() {
        assertEquals(0, target.search(intArrayOf(5, 1, 3), 5))
    }
}
