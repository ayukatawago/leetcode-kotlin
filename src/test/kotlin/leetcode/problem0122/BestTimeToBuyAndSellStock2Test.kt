package leetcode.problem0122

import kotlin.test.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStock2Test {
    private val target = BestTimeToBuyAndSellStock2()

    @Test
    fun test1() {
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        assertEquals(7, target.maxProfit(prices))
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
