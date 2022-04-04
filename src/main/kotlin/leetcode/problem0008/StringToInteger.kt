package leetcode.problem0008

class StringToInteger {
    fun myAtoi(s: String): Int {
        var isNegative = false

        val trimmedInput = when {
            s.trimStart().startsWith('-') -> {
                isNegative = true
                s.trimStart().drop(1)
            }
            s.trimStart().startsWith('+') -> s.trimStart().drop(1)
            else -> s.trimStart()
        }
        var numberString = ""

        for (c in trimmedInput) {
            if (!c.isDigit()) {
                break
            }
            numberString += c
        }

        val longNumber = when {
            numberString.trimStart('0').isEmpty() -> 0L
            numberString.trimStart('0').length > 11 -> Int.MAX_VALUE.toLong() + 1
            else -> numberString.trimStart('0').toLong()
        }
        return when {
            isNegative && Int.MAX_VALUE < longNumber -> Int.MIN_VALUE
            isNegative -> -longNumber.toInt()
            Int.MAX_VALUE < longNumber -> Int.MAX_VALUE
            else -> longNumber.toInt()
        }
    }
}
