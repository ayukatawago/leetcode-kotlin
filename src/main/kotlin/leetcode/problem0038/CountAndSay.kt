package leetcode.problem0038

class CountAndSay {
    fun countAndSay(n: Int): String {
        if (n == 1) {
            return "1"
        }
        var answer = ""
        val previousAnswer = countAndSay(n - 1)
        var lastValue = INITIAL_VALUE
        var count = 0
        var index = 0
        while (index <= previousAnswer.lastIndex) {
            if (lastValue == previousAnswer[index]) {
                count++
            } else {
                if (lastValue != INITIAL_VALUE) {
                    answer += "$count$lastValue"
                }
                lastValue = previousAnswer[index]
                count = 1
            }
            index++
        }
        answer += "$count$lastValue"
        return answer
    }

    companion object {
        private const val INITIAL_VALUE = ' '
    }
}
