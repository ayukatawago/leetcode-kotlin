package leetcode.problem0078

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SubsetsTest {
    private val target = Subsets()

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        assertEquals(
            setOf(listOf(), listOf(1), listOf(2), listOf(3), listOf(1, 2), listOf(1, 3), listOf(2, 3), listOf(1, 2, 3)),
            target.subsets(nums).toSet()
        )
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0)
        assertEquals(
            setOf(listOf(), listOf(0)),
            target.subsets(nums).toSet()
        )
    }
}
