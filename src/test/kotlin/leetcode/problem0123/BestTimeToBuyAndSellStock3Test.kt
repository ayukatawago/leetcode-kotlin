package leetcode.problem0123

import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStock3Test {
    private val target = BestTimeToBuyAndSellStock3()

    @Test
    fun test1() {
        val prices = intArrayOf(3, 3, 5, 0, 0, 3, 1, 4)
        assertEquals(6, target.maxProfit(prices))
    }

    @Test
    fun test2() {
        val prices = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(4, target.maxProfit(prices))
    }

    @Test
    fun test3() {
        val prices = intArrayOf(7, 6, 4, 3, 1)
        assertEquals(0, target.maxProfit(prices))
    }
}
