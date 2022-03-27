package leetcode.problem0007

import kotlin.math.abs

class ReverseInteger {
    fun reverse(x: Int): Int {
        val isNegative = x < 0
        val intString = abs(x).toString()
        val reversed = try {
            intString.reversed().toInt()
        } catch (e: NumberFormatException) {
            return 0
        }
        return if (isNegative) {
            -1 * reversed
        } else {
            reversed
        }
    }
}
