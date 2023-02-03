package leetcode.problem0126

class WordLadder2 {
    fun findLadders(beginWord: String, endWord: String, wordList: List<String>): List<List<String>> {
        if (endWord !in wordList) return emptyList()

        val wordSet = setOf(beginWord) + wordList.toSet()
        val adjacentWordMap: HashMap<String, List<String>> = hashMapOf()
        wordSet.forEach { word ->
            adjacentWordMap[word] = wordSet.filter { it.isAdjacent(word) }
        }

        val queue = ArrayDeque<String>()
        val levelMap: HashMap<String, Int> = hashMapOf()
        val graph: HashMap<String, MutableSet<String>> = hashMapOf()

        levelMap[beginWord] = 0
        queue.add(beginWord)
        while (queue.isNotEmpty()) {
            val currentWord = queue.removeFirst()
            val currentLevel = levelMap[currentWord] ?: throw IllegalStateException()
            if (!graph.containsKey(currentWord)) {
                graph[currentWord] = mutableSetOf()
            }

            adjacentWordMap[currentWord]?.forEach {
                graph[currentWord]?.add(it)
                if (!levelMap.containsKey(it)) {
                    levelMap[it] = currentLevel + 1
                    queue.add(it)
                }
            }
        }

        if (!levelMap.containsKey(endWord)) {
            return emptyList()
        }

        val answerSet = mutableListOf<List<String>>()
        val stringPath = mutableListOf<String>()

        fun buildAnswer(word: String, level: Int) {
            if (word == beginWord) {
                answerSet.add(stringPath + listOf(word))
                return
            }
            stringPath.add(word)

            graph[word]?.forEach { nextWord ->
                if (levelMap[nextWord] != level - 1) return@forEach
                buildAnswer(nextWord, level - 1)
            }
            stringPath.removeLast()
        }

        buildAnswer(endWord, levelMap[endWord]!!)
        return answerSet.map { it.reversed() }
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
