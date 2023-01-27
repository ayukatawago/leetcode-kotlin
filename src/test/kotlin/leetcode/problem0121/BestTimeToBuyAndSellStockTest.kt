package leetcode.problem0121

import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStockTest {
    private val target = BestTimeToBuyAndSellStock()

    @Test
    fun test1() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        assertEquals(5, target.maxProfit(prices))
    }

    @Test
    fun test2() {
        val prices = intArrayOf(7, 6, 4, 3, 1)
        assertEquals(0, target.maxProfit(prices))
    }
}
