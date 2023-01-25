package leetcode.problem0119

class PascalTriangle2 {
    fun getRow(rowIndex: Int): List<Int> {
        val array = LongArray(rowIndex + 1)

        array[0] = 1

        repeat(rowIndex) {
            array[it + 1] = array[it] * (rowIndex - it) / (it + 1)
        }

        return array.map { it.toInt() }
    }
}
