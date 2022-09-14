package leetcode.problem0055

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class JumpGameTest {
    private val target = JumpGame()

    @Test
    fun test1() {
        assertTrue(target.canJump(intArrayOf(2, 3, 1, 1, 4)))
    }

    @Test
    fun test2() {
        assertFalse(target.canJump(intArrayOf(3, 2, 1, 0, 4)))
    }
}
