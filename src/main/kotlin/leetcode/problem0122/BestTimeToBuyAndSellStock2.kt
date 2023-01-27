package leetcode.problem0122

class BestTimeToBuyAndSellStock2 {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size <= 1) return 0

        var totalProfit = 0
        (1..prices.lastIndex).forEach { index ->
            if (prices[index - 1] < prices[index]) {
                totalProfit += prices[index] - prices[index - 1]
            }
        }
        return totalProfit
    }
}
