package leetcode.problem0121

class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var maxPrice = 0
        var maxProfit = 0

        prices.reversed().forEach {
            if (it > maxPrice) {
                maxPrice = it
            }
            if (maxPrice - it > maxProfit) {
                maxProfit = maxPrice - it
            }
        }

        return maxProfit
    }
}
