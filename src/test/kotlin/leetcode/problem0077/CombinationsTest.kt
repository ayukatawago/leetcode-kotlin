package leetcode.problem0077

import kotlin.test.Test
import kotlin.test.assertEquals

internal class CombinationsTest {
    private val target = Combinations()

    @Test
    fun test1() {
        assertEquals(
            listOf(listOf(1, 2), listOf(1, 3), listOf(1, 4), listOf(2, 3), listOf(2, 4), listOf(3, 4)),
            target.combine(4, 2)
        )
    }

    @Test
    fun test2() {
        assertEquals(
            listOf(listOf(1)),
            target.combine(1, 1)
        )
    }

    @Test
    fun test3() {
        assertEquals(
            listOf(listOf(1, 2, 3), listOf(1, 2, 4), listOf(1, 3, 4), listOf(2, 3, 4)),
            target.combine(4, 3)
        )
    }

    @Test
    fun test4() {
        assertEquals(
            listOf(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)),
            target.combine(13, 13)
        )
    }
}
