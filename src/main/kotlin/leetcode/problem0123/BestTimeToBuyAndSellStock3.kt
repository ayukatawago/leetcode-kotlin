package leetcode.problem0123

import java.lang.IllegalArgumentException
import kotlin.math.max

class BestTimeToBuyAndSellStock3 {
    fun maxProfit(prices: IntArray): Int {
        val dp: Map<Boolean, Array<IntArray>> =
            mapOf(
                true to Array(prices.size) { IntArray(MAX_PURCHASE_COUNT) { -1 } },
                false to Array(prices.size) { IntArray(MAX_PURCHASE_COUNT) { -1 } }
            )
        return solve(prices, 0, false, 0, dp)
    }

    private fun solve(
        prices: IntArray,
        index: Int,
        hasStock: Boolean,
        count: Int,
        dp: Map<Boolean, Array<IntArray>>
    ): Int {
        val map = dp[hasStock] ?: throw IllegalArgumentException()
        return when {
            index == prices.size || count == MAX_PURCHASE_COUNT -> 0
            map[index][count] != -1 -> map[index][count]
            else -> {
                if (hasStock) {
                    max(
                        prices[index] + solve(prices, index + 1, false, count + 1, dp),
                        solve(prices, index + 1, true, count, dp)
                    )
                } else {
                    max(
                        -prices[index] + solve(prices, index + 1, true, count, dp),
                        solve(prices, index + 1, false, count, dp)
                    )
                }
                    .also {
                        map[index][count] = it
                    }
            }
        }
    }

    companion object {
        private const val MAX_PURCHASE_COUNT = 2
    }
}
