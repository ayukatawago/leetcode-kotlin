package leetcode.problem0127

class WordLadder {
    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        if (endWord !in wordList) return 0

        val wordSet = setOf(beginWord) + wordList.toSet()
        val adjacentWordMap: HashMap<String, List<String>> = hashMapOf()
        wordSet.forEach { word ->
            adjacentWordMap[word] = wordSet.filter { it.isAdjacent(word) }
        }

        val queue = ArrayDeque<String>()
        val levelMap: HashMap<String, Int> = hashMapOf()

        levelMap[beginWord] = 1
        queue.add(beginWord)
        while (queue.isNotEmpty()) {
            val currentWord = queue.removeFirst()
            val currentLevel = levelMap[currentWord] ?: throw IllegalStateException()

            adjacentWordMap[currentWord]?.forEach {
                if (!levelMap.containsKey(it)) {
                    levelMap[it] = currentLevel + 1
                    queue.add(it)
                }
            }
        }

        return levelMap[endWord] ?: 0
    }

    private fun String.isAdjacent(target: String): Boolean {
        if (this.length != target.length) return false
        var count = 0
        forEachIndexed { index, c ->
            if (target[index] != c) {
                count++
            }
        }
        return count == 1
    }
}
