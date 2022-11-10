package leetcode.problem0097

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class InterleavingStringTest {
    private val target = InterleavingString()

    @Test
    fun test1() {
        assertTrue(target.isInterleave("aabcc", "dbbca", "aadbbcbcac"))
    }

    @Test
    fun test2() {
        assertFalse(target.isInterleave("aabcc", "dbbca", "aadbbbaccc"))
    }

    @Test
    fun test3() {
        assertTrue(target.isInterleave("", "", ""))
    }
}
