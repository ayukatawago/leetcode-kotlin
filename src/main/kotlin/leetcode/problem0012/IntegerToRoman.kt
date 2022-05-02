package leetcode.problem0012

class IntegerToRoman {
    fun intToRoman(num: Int): String {
        var answer = ""
        var number = num

        Romans.values().forEach { roman ->
            when (number / roman.value) {
                9 -> {
                    answer += roman.nine
                    number -= 9 * roman.value
                }
                8, 7, 6, 5 -> {
                    answer += roman.five
                    number -= 5 * roman.value
                    val repeat = number / roman.value
                    answer += roman.name.repeat(repeat)
                    number %= roman.value
                }
                4 -> {
                    answer += roman.name
                    answer += roman.five
                    number -= 4 * roman.value
                }
                else -> {
                    val repeat = number / roman.value
                    answer += roman.name.repeat(repeat)
                    number %= roman.value
                }
            }
        }
        return answer
    }

    private enum class Romans(val value: Int, val five: String, val nine: String) {
        M(1000, "", ""),
        C(100, "D", "CM"),
        X(10, "L", "XC"),
        I(1, "V", "IX")
    }
}
