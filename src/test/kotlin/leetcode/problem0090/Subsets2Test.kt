package leetcode.problem0090

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Subsets2Test {
    private val target = Subsets2()

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 2)
        assertEquals(
            setOf(listOf(), listOf(1), listOf(1, 2), listOf(1, 2, 2), listOf(2), listOf(2, 2)),
            target.subsetsWithDup(nums).toSet()
        )
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0)
        assertEquals(
            setOf(listOf(), listOf(0)),
            target.subsetsWithDup(nums).toSet()
        )
    }
}
