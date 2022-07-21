package leetcode.problem0069

class SqrtX {
    fun mySqrt(x: Int): Int {
        var low = 0L
        var high = x.toLong()
        while (low < high) {
            val mid = (low + high) / 2
            when {
                mid * mid == x.toLong() -> return mid.toInt()
                mid * mid > x -> high = mid - 1L
                else -> low = mid + 1L
            }
        }
        return if (low * low > x) {
            (low - 1).toInt()
        } else {
            low.toInt()
        }
    }
}
