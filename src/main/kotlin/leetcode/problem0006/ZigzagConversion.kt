package leetcode.problem0006

class ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) {
            return s
        }

        val zigzagSize = numRows * 2 - 2
        val zigzagStringArray: Array<MutableList<Char>> = Array(numRows) { mutableListOf() }
        val zigzagIndexArray = Array(zigzagSize) { 0 }
        for (row in 0 until numRows) {
            zigzagIndexArray[row] = row
            if (row != 0 && row != numRows - 1) {
                zigzagIndexArray[zigzagSize - row] = row
            }
        }
        s.forEachIndexed { index, c ->
            val zigzagIndex = zigzagIndexArray[index % zigzagSize]
            zigzagStringArray[zigzagIndex].add(c)
        }

        return zigzagStringArray.flatMap { it }.joinToString("")
    }
}
