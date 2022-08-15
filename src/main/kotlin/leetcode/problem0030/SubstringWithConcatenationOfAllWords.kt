package leetcode.problem0030

class SubstringWithConcatenationOfAllWords {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val wordSize = words[0].length
        val windowSize = wordSize * words.size
        val wordsMap = hashMapOf<String, Int>()
        words.forEach {
            wordsMap[it] = (wordsMap[it] ?: 0) + 1
        }

        val answer = mutableListOf<Int>()
        s.indices.forEach { index ->
            if (s.length - index < windowSize) {
                return@forEach
            }
            var window = s.slice(index until index + windowSize)
            val foundMap = hashMapOf<String, Int>()
            while (window.length >= wordSize) {
                val word = window.substring(0, wordSize)
                if (word !in wordsMap.keys) {
                    break
                }
                foundMap[word] = (foundMap[word] ?: 0) + 1
                window = window.substring(wordSize)
            }
            if (foundMap == wordsMap) {
                answer.add(index)
            }
        }
        return answer
    }
}
