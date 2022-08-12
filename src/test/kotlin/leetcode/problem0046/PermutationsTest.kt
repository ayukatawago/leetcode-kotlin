package leetcode.problem0046

import kotlin.test.Test
import kotlin.test.assertEquals

internal class PermutationsTest {
    private val target = Permutations()

    @Test
    fun test1() {
        assertEquals(
            setOf(listOf(1, 2, 3), listOf(1, 3, 2), listOf(2, 1, 3), listOf(2, 3, 1), listOf(3, 1, 2), listOf(3, 2, 1)),
            target.permute(intArrayOf(1, 2, 3)).toSet()
        )
    }

    @Test
    fun test2() {
        assertEquals(
            setOf(listOf(0, 1), listOf(1, 0)),
            target.permute(intArrayOf(0, 1)).toSet()
        )
    }

    @Test
    fun test3() {
        assertEquals(
            setOf(listOf(1)),
            target.permute(intArrayOf(1)).toSet()
        )
    }
}
