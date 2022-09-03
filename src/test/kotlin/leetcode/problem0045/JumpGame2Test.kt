package leetcode.problem0045

import kotlin.test.Test
import kotlin.test.assertEquals

internal class JumpGame2Test {
    private val target = JumpGame2()

    @Test
    fun test1() {
        assertEquals(2, target.jump(intArrayOf(2, 3, 1, 1, 4)))
    }

    @Test
    fun test2() {
        assertEquals(2, target.jump(intArrayOf(2, 3, 0, 1, 4)))
    }
}
