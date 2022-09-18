package leetcode.problem0058

import kotlin.test.Test
import kotlin.test.assertEquals

internal class LengthOfLastWordTest {
    private val target = LengthOfLastWord()

    @Test
    fun test1() {
        assertEquals(5, target.lengthOfLastWord("Hello World"))
    }

    @Test
    fun test2() {
        assertEquals(4, target.lengthOfLastWord("   fly me   to   the moon  "))
    }

    @Test
    fun test3() {
        assertEquals(6, target.lengthOfLastWord("luffy is still joyboy"))
    }
}
