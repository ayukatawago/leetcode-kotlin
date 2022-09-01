package leetcode.problem0044

class WildcardMatching {
    fun isMatch(s: String, p: String): Boolean {
        val result = Array(s.length + 1) { IntArray(p.length + 1) { -1 } }

        return isMatch(s, p, 0, 0, result)
    }

    private fun isMatch(s: String, p: String, sIndex: Int, pIndex: Int, result: Array<IntArray>): Boolean {
        if (result[sIndex][pIndex] != -1) {
            return result[sIndex][pIndex] == 1
        }

        if (pIndex > p.lastIndex) {
            result[sIndex][pIndex] = if (sIndex > s.lastIndex) 1 else 0
            return sIndex > s.lastIndex
        }

        val isFirstCharMatch =
            sIndex <= s.lastIndex && (s[sIndex] == p[pIndex] || p[pIndex] == '?')

        val isMatched = if (p[pIndex] == '*') {
            isMatch(s, p, sIndex, pIndex + 1, result) ||
                (sIndex <= s.lastIndex && isMatch(s, p, sIndex + 1, pIndex, result))
        } else {
            isFirstCharMatch && isMatch(s, p, sIndex + 1, pIndex + 1, result)
        }
        result[sIndex][pIndex] = if (isMatched) 1 else 0
        return isMatched
    }
}
