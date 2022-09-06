package leetcode.problem0049

import kotlin.test.Test
import kotlin.test.assertEquals

internal class GroupAnagramsTest {
    private val target = GroupAnagrams()

    @Test
    fun test1() {
        assertEquals(
            setOf(setOf("bat"), setOf("nat", "tan"), setOf("ate", "eat", "tea")),
            target.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")).map { it.toSet() }.toSet()
        )
    }

    @Test
    fun test2() {
        assertEquals(
            listOf(listOf("")),
            target.groupAnagrams(arrayOf(""))
        )
    }

    @Test
    fun test3() {
        assertEquals(
            listOf(listOf("a")),
            target.groupAnagrams(arrayOf("a"))
        )
    }
}
