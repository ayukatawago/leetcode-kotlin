package leetcode.problem0014

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestCommonPrefixTest {
    private val target = LongestCommonPrefix()

    @Test
    fun test_1() {
        val input = arrayOf("flower", "flow", "flight")
        assertEquals("fl", target.longestCommonPrefix(input))
    }

    @Test
    fun test_2() {
        val input = arrayOf("dog", "racecar", "car")
        assertEquals("", target.longestCommonPrefix(input))
    }
}
