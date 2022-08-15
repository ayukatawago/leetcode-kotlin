package leetcode.problem0030

class SubstringWithConcatenationOfAllWords {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val wordSize = words[0].length
        val windowSize = wordSize * words.size

        val answer = mutableListOf<Int>()
        s.indices.forEach { index ->
            if (s.length - index < windowSize) {
                return@forEach
            }
            val window = s.slice(index until index + windowSize)
            val wordsInWindow = window.chunked(wordSize).sorted()
            if (words.sorted() == wordsInWindow) {
                answer.add(index)
            }
        }
        return answer
    }
}
