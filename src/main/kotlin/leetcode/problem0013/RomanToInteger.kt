package leetcode.problem0013

class RomanToInteger {
    fun romanToInt(s: String): Int {
        val converted = s.replace("CM", "DCCCC")
            .replace("CD", "CCCC")
            .replace("XC", "LXXXX")
            .replace("XL", "XXXX")
            .replace("IX", "VIIII")
            .replace("IV", "IIII")

        var answer = 0
        converted.forEach {
            answer += Romans.valueOf(it.toString()).value
        }
        return answer
    }

    private enum class Romans(val value: Int) {
        M(1000),
        D(500),
        C(100),
        L(50),
        X(10),
        V(5),
        I(1)
    }
}
