package leetcode.problem0039

import kotlin.test.Test
import kotlin.test.assertEquals

internal class CombinationSumTest {
    private val target = CombinationSum()

    @Test
    fun test1() {
        val candidates = intArrayOf(2, 3, 6, 7)
        assertEquals(listOf(listOf(2, 2, 3), listOf(7)), target.combinationSum(candidates, 7))
    }

    @Test
    fun test2() {
        val candidates = intArrayOf(2, 3, 5)
        assertEquals(listOf(listOf(2, 2, 2, 2), listOf(2, 3, 3), listOf(3, 5)), target.combinationSum(candidates, 8))
    }

    @Test
    fun test3() {
        val candidates = intArrayOf(2)
        assertEquals(emptyList(), target.combinationSum(candidates, 1))
    }
}
