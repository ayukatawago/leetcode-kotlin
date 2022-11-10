package leetcode.problem0097

class InterleavingString {
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        if (s3.length != s1.length + s2.length) {
            return false
        }

        val dpMap = Array(s1.length + 1) { BooleanArray(s2.length + 1) }

        (0..s1.length).forEach { row ->
            (0..s2.length).forEach { column ->
                dpMap[row][column] = when {
                    row == 0 && column == 0 -> true
                    row == 0 -> dpMap[0][column - 1] && s2[column - 1] == s3[column - 1]
                    column == 0 -> dpMap[row - 1][0] && s1[row - 1] == s3[row - 1]
                    else -> dpMap[row][column - 1] && s2[column - 1] == s3[row + column - 1] ||
                        dpMap[row - 1][column] && s1[row - 1] == s3[row + column - 1]
                }
            }
        }

        return dpMap[s1.length][s2.length]
    }
}
