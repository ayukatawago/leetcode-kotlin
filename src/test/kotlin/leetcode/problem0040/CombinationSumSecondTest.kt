package leetcode.problem0040

import kotlin.test.Test
import kotlin.test.assertEquals

internal class CombinationSumSecondTest {
    private val target = CombinationSumSecond()

    @Test
    fun test1() {
        val candidates = intArrayOf(10, 1, 2, 7, 6, 1, 5)
        assertEquals(
            setOf(listOf(1, 1, 6), listOf(1, 2, 5), listOf(1, 7), listOf(2, 6)),
            target.combinationSum2(candidates, 8).toSet()
        )
    }

    @Test
    fun test2() {
        val candidates = intArrayOf(2, 5, 2, 1, 2)
        assertEquals(setOf(listOf(1, 2, 2), listOf(5)), target.combinationSum2(candidates, 5).toSet())
    }

    @Test
    fun test3() {
        val candidates = intArrayOf(
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            1
        )
        assertEquals(
            setOf(listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)),
            target.combinationSum2(candidates, 30).toSet()
        )
    }
}
