package leetcode.problem0076

import kotlin.test.Test
import kotlin.test.assertEquals

internal class MinimumWindowSubstringTest {
    private val target = MinimumWindowSubstring()

    @Test
    fun test1() {
        assertEquals("BANC", target.minWindow("ADOBECODEBANC", "ABC"))
    }

    @Test
    fun test2() {
        assertEquals("a", target.minWindow("a", "a"))
    }

    @Test
    fun test3() {
        assertEquals("", target.minWindow("a", "aa"))
    }
}
