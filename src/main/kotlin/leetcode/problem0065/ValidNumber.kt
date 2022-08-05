package leetcode.problem0065

class ValidNumber {
    fun isNumber(s: String): Boolean {
        val regex = Regex("""[+-]?(?:\d+\.?\d*|\.\d+)(?:[eE][+-]?\d+)?""")
        return s.matches(regex)
    }
}
