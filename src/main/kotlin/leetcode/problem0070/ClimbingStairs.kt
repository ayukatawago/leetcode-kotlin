package leetcode.problem0070

class ClimbingStairs {
    fun climbStairs(n: Int): Int =
        when (n) {
            1 -> 1
            else -> {
                val array = IntArray(n)
                array[0] = 1
                array[1] = 2
                IntRange(2, n - 1).forEach {
                    array[it] = array[it - 1] + array[it - 2]
                }
                array[n - 1]
            }
        }
}
