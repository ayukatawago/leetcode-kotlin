package leetcode.problem0096

class UniqueBinarySearchTrees {
    fun numTrees(n: Int): Int {
        val dpMap = hashMapOf<Int, Int>()
        return findTrees(1, n, dpMap)
    }

    private fun findTrees(start: Int, end: Int, dpMap: HashMap<Int, Int>): Int =
        when {
            start >= end -> 1
            end - start in dpMap.keys -> requireNotNull(dpMap[end - start])
            else -> {
                (start..end).sumOf { num ->
                    val left = findTrees(start, num - 1, dpMap)
                    val right = findTrees(num + 1, end, dpMap)
                    left * right
                }.also {
                    dpMap[end - start] = it
                }
            }
        }
}
