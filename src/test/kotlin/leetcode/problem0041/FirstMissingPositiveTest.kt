package leetcode.problem0041

import kotlin.test.Test
import kotlin.test.assertEquals

internal class FirstMissingPositiveTest {
    private val target = FirstMissingPositive()

    @Test
    fun test1() {
        assertEquals(3, target.firstMissingPositive(intArrayOf(1, 2, 0)))
    }

    @Test
    fun test2() {
        assertEquals(2, target.firstMissingPositive(intArrayOf(3, 4, -1, 1)))
    }

    @Test
    fun test3() {
        assertEquals(1, target.firstMissingPositive(intArrayOf(7, 8, 9, 11, 12)))
    }

    @Test
    fun test4() {
        assertEquals(3, target.firstMissingPositive(intArrayOf(7, 8, 9, 2, 1)))
    }

    @Test
    fun test5() {
        assertEquals(4, target.firstMissingPositive(intArrayOf(2, 8, 9, 3, 1)))
    }

    @Test
    fun test6() {
        assertEquals(2, target.firstMissingPositive(intArrayOf(1)))
    }
}
