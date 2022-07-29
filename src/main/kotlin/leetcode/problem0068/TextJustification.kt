package leetcode.problem0068

class TextJustification {
    fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
        var index = 0
        var answerIndex = 0
        val answer = ArrayList<String>()

        while (index <= words.lastIndex) {
            val tmpList = mutableListOf<String>()
            var remaining = maxWidth
            while (remaining > 0 && index <= words.lastIndex) {
                remaining -= words[index].length
                if (remaining >= 0) {
                    tmpList.add(words[index])
                    remaining -= 1
                    index++
                }
            }
            answer.add(tmpList.toJustifiedString(maxWidth, isLast = index > words.lastIndex))
            answerIndex++
        }

        return answer
    }

    private fun List<String>.toJustifiedString(maxWidth: Int, isLast: Boolean): String =
        if (isLast || size == 1) {
            val tmp = joinToString(" ")
            tmp + " ".repeat(maxWidth - tmp.length)
        } else {
            val spaceCount = maxWidth - map { it.length }.sum()
            val average = spaceCount / (size - 1)
            var rest = spaceCount % (size - 1)
            val stringBuilder = StringBuilder()
            forEachIndexed { index, s ->
                stringBuilder.append(s)
                if (index != lastIndex) {
                    val count = if (rest > 0) {
                        rest--
                        average + 1
                    } else {
                        average
                    }
                    val spaces = " ".repeat(count)
                    stringBuilder.append(spaces)
                }
            }
            stringBuilder.toString()
        }
}
