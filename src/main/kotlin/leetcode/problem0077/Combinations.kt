package leetcode.problem0077

class Combinations {
    fun combine(n: Int, k: Int): List<List<Int>> =
        when (k) {
            1 -> IntRange(1, n).map { listOf(it) }
            else -> combine(1, n, k)
        }

    private fun combine(start: Int, end: Int, k: Int): List<List<Int>> =
        if (k == 1) {
            IntRange(start, end).map { listOf(it) }
        } else {
            IntRange(start, end - 1).flatMap {
                combine(it + 1, end, k - 1).map { list ->
                    println(list)
                    val tmpList = mutableListOf<Int>()
                    tmpList.add(it)
                    tmpList.addAll(list)
                    tmpList
                }
            }
        }
}
