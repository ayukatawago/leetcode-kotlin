package leetcode.problem0127

import kotlin.test.Test
import kotlin.test.assertEquals

class WordLadderTest {
    private val target = WordLadder()

    @Test
    fun test1() {
        val wordList = listOf("hot", "dot", "dog", "lot", "log", "cog")
        assertEquals(5, target.ladderLength("hit", "cog", wordList))
    }

    @Test
    fun test2() {
        val wordList = listOf("hot", "dot", "dog", "lot", "log")
        assertEquals(0, target.ladderLength("hit", "cog", wordList))
    }

    @Test
    fun test3() {
        val wordList = listOf("hot", "dog")
        assertEquals(0, target.ladderLength("hit", "dog", wordList))
    }
}
