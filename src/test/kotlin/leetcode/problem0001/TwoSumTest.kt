package leetcode.problem0001

import TwoSum
import org.junit.Test
import kotlin.test.assertEquals

class TwoSumTest {
    private val solution = TwoSum()

    @Test
    fun test1() {
        val input = intArrayOf(2, 7, 11, 15)
        val target = 9
        assertEquals(listOf(0, 1), solution.twoSum(input, target)?.toList())
    }

    @Test
    fun test2() {
        val input = intArrayOf(3, 2, 4)
        val target = 6
        assertEquals(listOf(1, 2), solution.twoSum(input, target)?.toList())
    }

    @Test
    fun test3() {
        val input = intArrayOf(3, 3)
        val target = 6
        assertEquals(listOf(0, 1), solution.twoSum(input, target)?.toList())
    }
}
