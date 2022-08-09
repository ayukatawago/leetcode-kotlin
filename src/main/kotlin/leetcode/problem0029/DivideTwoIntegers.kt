package leetcode.problem0029

import kotlin.math.abs

class DivideTwoIntegers {
    fun divide(dividend: Int, divisor: Int): Int {
        if (divisor == 0) {
            throw IllegalArgumentException()
        }

        // Corner case to avoid overflow
        if (dividend == Int.MIN_VALUE && divisor == -1) {
            return Int.MAX_VALUE
        }

        val isNegative = (dividend > 0) xor (divisor > 0)

        var count = 0
        var remaining = abs(dividend)

        while (remaining - abs(divisor) >= 0) {
            remaining -= abs(divisor)
            count++
        }
        return if (isNegative) -count else count
    }
}
