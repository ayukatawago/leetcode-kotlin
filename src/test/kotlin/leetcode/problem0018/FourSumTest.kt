package leetcode.problem0018

import kotlin.test.Test
import kotlin.test.assertEquals

class FourSumTest {
    private val target = FourSum()

    @Test
    fun test1() {
        val output = target.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0)
        val answerSet = setOf(listOf(-2, -1, 1, 2), listOf(-2, 0, 0, 2), listOf(-1, 0, 0, 1))
        assertEquals(answerSet, output.toSet())
    }

    @Test
    fun test2() {
        val output = target.fourSum(intArrayOf(2, 2, 2, 2, 2), 8)
        val answerSet = setOf(listOf(2, 2, 2, 2))
        assertEquals(answerSet, output.toSet())
    }

    @Test
    fun test3() {
        val output = target.fourSum(intArrayOf(-3, -2, -1, 0, 0, 1, 2, 3), 0)
        val answerSet = setOf(
            listOf(-3, -2, 2, 3), listOf(-3, -1, 1, 3), listOf(-3, 0, 0, 3), listOf(-3, 0, 1, 2),
            listOf(-2, -1, 0, 3), listOf(-2, -1, 1, 2), listOf(-2, 0, 0, 2), listOf(-1, 0, 0, 1)
        )
        assertEquals(answerSet, output.toSet())
    }
}
