package leetcode.problem0057

import kotlin.test.Test
import kotlin.test.assertEquals

internal class InsertIntervalTest {
    private val target = InsertInterval()

    @Test
    fun test1() {
        assertEquals(
            listOf(listOf(1, 5), listOf(6, 9)),
            target.insert(arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)), intArrayOf(2, 5)).map { it.toList() }
        )
    }

    @Test
    fun test2() {
        assertEquals(
            listOf(listOf(1, 2), listOf(3, 10), listOf(12, 16)),
            target.insert(
                arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16)),
                intArrayOf(4, 8)
            ).map { it.toList() }
        )
    }

    @Test
    fun test3() {
        assertEquals(
            listOf(listOf(1, 2), listOf(5, 6), listOf(9, 10)),
            target.insert(
                arrayOf(intArrayOf(1, 2), intArrayOf(9, 10)),
                intArrayOf(5, 6)
            ).map { it.toList() }
        )
    }

    @Test
    fun test4() {
        assertEquals(
            listOf(listOf(5, 7)),
            target.insert(arrayOf(), intArrayOf(5, 7)).map { it.toList() }
        )
    }

    @Test
    fun test5() {
        assertEquals(
            listOf(listOf(1, 5), listOf(6, 8)),
            target.insert(arrayOf(intArrayOf(1, 5)), intArrayOf(6, 8)).map { it.toList() }
        )
    }

    @Test
    fun test6() {
        assertEquals(
            listOf(listOf(0, 0), listOf(1, 5)),
            target.insert(arrayOf(intArrayOf(1, 5)), intArrayOf(0, 0)).map { it.toList() }
        )
    }
}
