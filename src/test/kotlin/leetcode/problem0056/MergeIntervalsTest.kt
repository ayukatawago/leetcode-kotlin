package leetcode.problem0056

import kotlin.test.Test
import kotlin.test.assertEquals

internal class MergeIntervalsTest {
    private val target = MergeIntervals()

    @Test
    fun test1() {
        val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18))
        assertEquals(
            listOf(listOf(1, 6), listOf(8, 10), listOf(15, 18)),
            target.merge(intervals).map { it.toList() }
        )
    }

    @Test
    fun test2() {
        val intervals = arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))
        assertEquals(
            listOf(listOf(1, 5)),
            target.merge(intervals).map { it.toList() }
        )
    }

    @Test
    fun test3() {
        val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(8, 10), intArrayOf(2, 8), intArrayOf(15, 18))
        assertEquals(
            listOf(listOf(1, 10), listOf(15, 18)),
            target.merge(intervals).map { it.toList() }
        )
    }
}
