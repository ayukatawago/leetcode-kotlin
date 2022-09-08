package leetcode.problem0050

class Pow {
    fun myPow(x: Double, n: Int): Double =
        when {
            n == 0 -> 1.0
            n < 0 -> 1 / (x * myPow(x, -n - 1)) // Splits to x * myPor(x, -n - 1) for Int.MIN_VALUE consideration
            n % 2 == 0 -> {
                val half = myPow(x, n / 2)
                half * half
            }
            else -> x * myPow(x, n - 1)
        }
}
