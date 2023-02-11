package leetcode.problem0128

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestConsecutiveSequenceTest {
    private val target = LongestConsecutiveSequence()

    @Test
    fun test1() {
        val nums = intArrayOf(100, 4, 200, 1, 3, 2)
        assertEquals(4, target.longestConsecutive(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)
        assertEquals(9, target.longestConsecutive(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(100, 4, 200, 1, 201, 202, 203, 204, 3, 2, 300)
        assertEquals(5, target.longestConsecutive(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf()
        assertEquals(0, target.longestConsecutive(nums))
    }

    @Test
    fun test5() {
        val nums = intArrayOf(1)
        assertEquals(1, target.longestConsecutive(nums))
    }
}
