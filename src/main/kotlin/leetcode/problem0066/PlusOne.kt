package leetcode.problem0066

class PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        val answer = IntArray(digits.size + 1) { 0 }
        var shouldIncrement = true
        digits.reversed().forEachIndexed { index, i ->
            answer[digits.size - index] = when {
                shouldIncrement && i == 9 -> 0
                shouldIncrement -> {
                    shouldIncrement = false
                    i + 1
                }
                else -> i
            }
        }
        if (shouldIncrement) {
            answer[0] = 1
            return answer
        }

        return answer.drop(1).toIntArray()
    }
}
