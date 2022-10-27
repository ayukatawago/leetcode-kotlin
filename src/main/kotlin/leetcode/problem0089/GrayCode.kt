package leetcode.problem0089

class GrayCode {
    fun grayCode(n: Int): List<Int> {
        if (n == 1) {
            return listOf(0, 1)
        }
        val tmp = grayCode(n - 1)

        return tmp + tmp.reversed().map { it + 1.shl(n - 1) }
    }
}
