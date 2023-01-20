package leetcode.problem0115

class DistinctSubsequences {
    fun numDistinct(s: String, t: String): Int {
        val dp = Array(t.length + 1) { IntArray(s.length + 1) }

        s.indices.forEach { sIndex ->
            dp[0][sIndex] = 1
        }

        t.forEachIndexed { tIndex, tChar ->
            s.forEachIndexed { sIndex, sChar ->
                dp[tIndex + 1][sIndex + 1] = if (tChar == sChar) {
                    dp[tIndex][sIndex] + dp[tIndex + 1][sIndex]
                } else {
                    dp[tIndex + 1][sIndex]
                }
            }
        }

        return dp[t.length][s.length]
    }
}
