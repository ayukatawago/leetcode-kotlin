package leetcode.problem0126

import kotlin.test.Test
import kotlin.test.assertEquals

class WordLadder2Test {
    private val target = WordLadder2()

    @Test
    fun test1() {
        assertEquals(
            listOf(listOf("hit", "hot", "dot", "dog", "cog"), listOf("hit", "hot", "lot", "log", "cog")),
            target.findLadders("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog"))
        )
    }

    @Test
    fun test2() {
        assertEquals(
            emptyList(),
            target.findLadders("hit", "cog", listOf("hot", "dot", "dog", "lot", "log"))
        )
    }

    @Test
    fun test3() {
        assertEquals(
            emptyList(),
            target.findLadders("hot", "dog", listOf("hot", "dog"))
        )
    }
}
