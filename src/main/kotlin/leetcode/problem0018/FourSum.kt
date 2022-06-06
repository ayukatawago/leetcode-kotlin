package leetcode.problem0018

class FourSum {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val sortedNums = nums.sorted()

        return kSum(sortedNums, target, 4).toSet().toList()
    }

    private fun kSum(sortedNums: List<Int>, target: Int, k: Int): List<List<Int>> {
        if (sortedNums.isEmpty()) {
            return emptyList()
        }
        val answerMap = HashMap<Int, List<List<Int>>>()
        sortedNums.forEachIndexed { index, num ->
            if (answerMap[num] != null) {
                return@forEachIndexed
            }
            val remainingNums = sortedNums.drop(index + 1)
            val answerList = if (k == 3) {
                twoSum(remainingNums, target - num)
            } else {
                kSum(remainingNums, target - num, k - 1)
            }
            answerMap[num] = answerList.map { getAnswer(num, it) }
        }
        return answerMap.flatMap { it.value }
    }

    private fun getAnswer(num: Int, numList: List<Int>): List<Int> =
        mutableListOf(num).also {
            it.addAll(numList)
        }

    private fun twoSum(sortedNums: List<Int>, target: Int): List<List<Int>> {
        if (sortedNums.size < 2) {
            return emptyList()
        }

        val answerList = mutableListOf<List<Int>>()
        var left = 0
        var right = sortedNums.lastIndex

        while (left < right) {
            val leftValue = sortedNums[left]
            val rightValue = sortedNums[right]
            when {
                leftValue + rightValue == target -> {
                    answerList.add(listOf(leftValue, rightValue))
                    left += 1
                }
                leftValue + rightValue < target -> left += 1
                leftValue + rightValue > target -> right -= 1
            }
        }
        return answerList
    }
}
