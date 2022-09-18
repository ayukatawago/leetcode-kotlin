package leetcode.problem0058

class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        var lastWordLength = 0
        var wordLength = 0
        s.forEach {
            if (it != ' ') {
                wordLength++
                return@forEach
            }
            if (wordLength != 0) {
                lastWordLength = wordLength
            }
            wordLength = 0
        }
        if (wordLength != 0) {
            lastWordLength = wordLength
        }

        return lastWordLength
    }
}
