package leetcode.problem0072

class EditDistance {
    fun minDistance(word1: String, word2: String): Int {
        val size1 = word1.length
        val size2 = word2.length
        val costArray = Array(size1 + 1) { IntArray(size2 + 1) { -1 } }

        (0..size1).forEach {
            costArray[it][0] = it
        }
        (0..size2).forEach {
            costArray[0][it] = it
        }

        word1.indices.forEach { row ->
            word2.indices.forEach { column ->
                costArray[row + 1][column + 1] = if (word1[row] == word2[column]) {
                    costArray[row][column]
                } else {
                    val insert = costArray[row][column]
                    val delete = costArray[row][column + 1]
                    val replace = costArray[row + 1][column]
                    minOf(insert, delete, replace) + 1
                }
            }
        }
        println(costArray.map { it.toList() })
        return costArray[size1][size2]
    }
}
