package leetcode.problem0066

import kotlin.test.Test
import kotlin.test.assertEquals

internal class PlusOneTest {
    private val target = PlusOne()

    @Test
    fun test1() {
        val digits = intArrayOf(1, 2, 3)
        assertEquals(listOf(1, 2, 4), target.plusOne(digits).toList())
    }

    @Test
    fun test2() {
        val digits = intArrayOf(4, 3, 2, 1)
        assertEquals(listOf(4, 3, 2, 2), target.plusOne(digits).toList())
    }

    @Test
    fun test3() {
        val digits = intArrayOf(9)
        assertEquals(listOf(1, 0), target.plusOne(digits).toList())
    }
}
