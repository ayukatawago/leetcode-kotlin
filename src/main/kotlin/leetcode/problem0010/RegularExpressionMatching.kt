package leetcode.problem0010

class RegularExpressionMatching {
    fun isMatch(s: String, p: String): Boolean {
        if (p.isEmpty()) {
            return s.isEmpty()
        }

        val isFirstCharMatch =
            s.isNotEmpty() && s[0] == p[0] || p[0] == '.'

        return if (p.length >= 2 && p[1] == '*') {
            isMatch(s, p.substring(2)) || (isFirstCharMatch && s.isNotEmpty() && isMatch(s.substring(1), p))
        } else {
            s.isNotEmpty() && isFirstCharMatch && isMatch(s.substring(1), p.substring(1))
        }
    }
}
