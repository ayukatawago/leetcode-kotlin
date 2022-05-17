package leetcode.problem0015

class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.isEmpty()) {
            return emptyList()
        }
        val answerMap = HashMap<Int, Int>()
        val answerSet = mutableSetOf<List<Int>>()
        nums.forEachIndexed { index, num ->
            if (answerMap.containsKey(num)) {
                return@forEachIndexed
            }

            val tmpList = nums.toMutableList()
            tmpList.removeAt(index)
            val twoSumList = twoSum(tmpList.toIntArray(), -num)
            twoSumList.forEach { twoSum ->
                if (twoSum.size != 2) {
                    return@forEach
                }
                val answer = listOf(num, twoSum[0], twoSum[1]).sorted()
                answerSet.add(answer)
            }
            answerMap[num] = index
        }

        return answerSet.toList()
    }

    private fun twoSum(nums: IntArray, target: Int): List<List<Int>> {
        val hashmap = HashMap<Int, Int>()

        val answerList = mutableListOf<List<Int>>()
        nums.forEachIndexed { index, value ->
            val missing = target - value
            if (hashmap.containsKey(missing) && hashmap[missing] != index) {
                hashmap[missing]?.let {
                    answerList.add(listOf(nums[it], value))
                }
            }
            hashmap[value] = index
        }
        return answerList
    }
}
