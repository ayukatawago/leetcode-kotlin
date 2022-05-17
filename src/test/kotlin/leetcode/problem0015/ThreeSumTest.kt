package leetcode.problem0015

import kotlin.test.Test
import kotlin.test.assertEquals

class ThreeSumTest {
    private val target = ThreeSum()

    @Test
    fun test1() {
        val output = target.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        assertEquals(2, output.size)
        val answerSet = setOf(listOf(-1, 0, 1), listOf(-1, -1, 2))
        assertEquals(answerSet, output.toSet())
    }

    @Test
    fun test2() {
        val output = target.threeSum(intArrayOf())
        assertEquals(0, output.size)
    }

    @Test
    fun test3() {
        val output = target.threeSum(intArrayOf(0))
        assertEquals(0, output.size)
    }

    @org.junit.Test
    fun test4() {
        val output = target.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4))
        assertEquals(9, output.size)
        val answerSet = setOf(
            listOf(-4, 0, 4), listOf(-4, 1, 3), listOf(-3, -1, 4),
            listOf(-3, 0, 3), listOf(-3, 1, 2), listOf(-2, -1, 3),
            listOf(-2, 0, 2), listOf(-1, -1, 2), listOf(-1, 0, 1)
        )
        assertEquals(answerSet, output.toSet())
    }
}
