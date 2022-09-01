package leetcode.problem0044

class WildcardMatching {
    fun isMatch(s: String, p: String): Boolean {
        val result = Array(s.length + 1) { BooleanArray(p.length + 1) }

        (s.length downTo 0).forEach { sIndex ->
            (p.length downTo 0).forEach { pIndex ->
                result[sIndex][pIndex] = when {
                    sIndex == s.length ->
                        pIndex == p.length || (p[pIndex] == '*' && result[sIndex][pIndex + 1])
                    pIndex == p.length -> false
                    else -> {
                        when (p[pIndex]) {
                            '?', s[sIndex] -> result[sIndex + 1][pIndex + 1]
                            '*' -> result[sIndex + 1][pIndex] || result[sIndex][pIndex + 1]
                            else -> false
                        }
                    }
                }
            }
        }

        return result[0][0]
    }
}
