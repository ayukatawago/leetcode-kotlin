package leetcode.problem0039

class CombinationSum {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        if (candidates.all { it > target }) {
            return emptyList()
        }

        val answer = mutableSetOf<List<Int>>()

        candidates.forEachIndexed { index, candidate ->
            when {
                target == candidate -> answer.add(listOf(candidate))
                target > candidate -> combinationSum(
                    candidates.sliceArray(index..candidates.lastIndex),
                    target - candidate
                ).map {
                    if (it.isNotEmpty()) {
                        answer.add(it.toMutableList().apply { add(candidate) }.sorted())
                    }
                }
                else -> Unit
            }
        }
        return answer.toList()
    }
}
