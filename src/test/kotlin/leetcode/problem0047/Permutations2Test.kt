package leetcode.problem0047

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Permutations2Test {
    private val target = Permutations2()

    @Test
    fun test1() {
        assertEquals(
            listOf(listOf(1, 1, 2), listOf(1, 2, 1), listOf(2, 1, 1)),
            target.permuteUnique(intArrayOf(1, 1, 2))
        )
    }

    @Test
    fun test2() {
        assertEquals(
            listOf(
                listOf(1, 2, 3),
                listOf(1, 3, 2),
                listOf(2, 1, 3),
                listOf(2, 3, 1),
                listOf(3, 1, 2),
                listOf(3, 2, 1)
            ),
            target.permuteUnique(intArrayOf(1, 2, 3))
        )
    }

    @Test
    fun test3() {
        assertEquals(
            listOf(listOf(1, 1, 1)),
            target.permuteUnique(intArrayOf(1, 1, 1))
        )
    }
}
