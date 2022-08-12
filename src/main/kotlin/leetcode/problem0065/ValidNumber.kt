package leetcode.problem0065

class ValidNumber {
    fun isNumber(s: String): Boolean {
        var hasDigit = false
        var hasDecimal = false
        var hasExponent = false
        var shouldHaveDigit = false

        s.forEachIndexed { index, c ->
            when {
                c in listOf('+', '-') -> {
                    if (index != 0 && !s[index - 1].isExponentChar()) {
                        return false
                    }
                }
                c.isDigit() -> {
                    hasDigit = true
                    shouldHaveDigit = false
                }
                c == '.' -> {
                    if (hasDecimal || hasExponent) {
                        return false
                    }
                    hasDecimal = true
                }
                c.isExponentChar() -> {
                    if (hasExponent || !hasDigit) {
                        return false
                    }
                    hasExponent = true
                    shouldHaveDigit = true
                }
                else -> return false
            }
        }

        return !shouldHaveDigit && hasDigit
    }

    private fun Char.isExponentChar(): Boolean = this in listOf('E', 'e')
}
