package leetcode.problem0010

class RegularExpressionMatching {
    fun isMatch(s: String, p: String): Boolean {
        val result = Array(s.length + 1) { BooleanArray(p.length + 1) }

        result[s.length][p.length] = true

        (s.length downTo 0).forEach { sIndex ->
            (p.lastIndex downTo 0).forEach { pIndex ->
                val firstMatch = sIndex < s.length && (p[pIndex] == '.' || p[pIndex] == s[sIndex])
                result[sIndex][pIndex] = if (pIndex + 1 < p.length && p[pIndex + 1] == '*') {
                    result[sIndex][pIndex + 2] || (firstMatch && result[sIndex + 1][pIndex])
                } else {
                    firstMatch && result[sIndex + 1][pIndex + 1]
                }
            }
        }

        return result[0][0]
    }
}
