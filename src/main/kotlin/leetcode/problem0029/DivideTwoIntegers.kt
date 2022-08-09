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

        val answer = bitDivide(abs(dividend.toLong()), abs(divisor.toLong()))

        return if (isNegative) -answer else answer
    }

    private fun bitDivide(dividend: Long, divisor: Long): Int {
        if (dividend < divisor) {
            return 0
        }
        var bitCount = 0
        while (dividend - divisor.shl(bitCount) >= 0 && bitCount < 31) {
            bitCount++
        }
        val remaining = dividend - divisor.shl(bitCount - 1)

        return if (remaining < divisor) {
            1.shl(bitCount - 1)
        } else {
            1.shl(bitCount - 1) + bitDivide(remaining, divisor)
        }
    }
}
