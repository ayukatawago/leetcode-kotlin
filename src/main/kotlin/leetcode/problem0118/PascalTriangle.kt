package leetcode.problem0118

class PascalTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        if (numRows == 1) {
            return listOf(listOf(1))
        }
        val previousLists = generate(numRows - 1)
        val newRow = mutableListOf<Int>()
        var storedNum = 0
        previousLists.last().forEach { num ->
            newRow.add(storedNum + num)
            storedNum = num
        }
        newRow.add(1)
        return mutableListOf<List<Int>>().apply {
            addAll(previousLists)
            add(newRow)
        }
    }
}
