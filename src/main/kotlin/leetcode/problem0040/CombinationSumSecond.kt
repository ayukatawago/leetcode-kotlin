package leetcode.problem0040

class CombinationSumSecond {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        if (candidates.all { it > target }) {
            return emptyList()
        }

        val countMap = hashMapOf<Int, Int>()
        candidates.forEach {
            countMap[it] = (countMap[it] ?: 0) + 1
        }

        return combinationSum(countMap, target).toList()
    }

    private fun combinationSum(hashMap: HashMap<Int, Int>, target: Int): Set<List<Int>> {
        val answer = mutableSetOf<List<Int>>()
        hashMap.forEach { (candidate, count) ->
            if (count == 0) return@forEach
            when {
                target == candidate -> answer.add(listOf(candidate))
                target > candidate -> {
                    hashMap[candidate] = count - 1
                    combinationSum(hashMap, target - candidate).forEach {
                        if (it.isNotEmpty()) {
                            answer.add(it.toMutableList().apply { add(candidate) }.sorted())
                        }
                    }
                    hashMap[candidate] = count
                }
                else -> Unit
            }
        }
        return answer
    }
}
