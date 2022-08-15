package leetcode.problem0030

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SubstringWithConcatenationOfAllWordsTest {
    private val target = SubstringWithConcatenationOfAllWords()

    @Test
    fun test1() {
        val s = "barfoothefoobarman"
        val words = arrayOf("foo", "bar")
        assertEquals(listOf(0, 9), target.findSubstring(s, words))
    }

    @Test
    fun test2() {
        val s = "wordgoodgoodgoodbestword"
        val words = arrayOf("word", "good", "best", "word")
        assertEquals(emptyList(), target.findSubstring(s, words))
    }

    @Test
    fun test3() {
        val s = "barfoofoobarthefoobarman"
        val words = arrayOf("bar", "foo", "the")
        assertEquals(listOf(6, 9, 12), target.findSubstring(s, words))
    }
}
