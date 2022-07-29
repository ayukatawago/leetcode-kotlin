package leetcode.problem0068

import kotlin.test.Test
import kotlin.test.assertEquals

internal class TextJustificationTest {
    private val target = TextJustification()

    @Test
    fun test1() {
        val words = arrayOf("This", "is", "an", "example", "of", "text", "justification.")
        assertEquals(
            listOf(
                "This    is    an",
                "example  of text",
                "justification.  "
            ),
            target.fullJustify(words, 16)
        )
    }

    @Test
    fun test2() {
        val words = arrayOf("What", "must", "be", "acknowledgment", "shall", "be")
        assertEquals(
            listOf(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
            ),
            target.fullJustify(words, 16)
        )
    }

    @Test
    fun test3() {
        val words = arrayOf(
            "Science",
            "is",
            "what",
            "we",
            "understand",
            "well",
            "enough",
            "to",
            "explain",
            "to",
            "a",
            "computer.",
            "Art",
            "is",
            "everything",
            "else",
            "we",
            "do"
        )
        assertEquals(
            listOf(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "
            ),
            target.fullJustify(words, 20)
        )
    }
}
