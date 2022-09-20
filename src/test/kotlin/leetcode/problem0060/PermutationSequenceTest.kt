package leetcode.problem0060

import kotlin.test.Test
import kotlin.test.assertEquals

internal class PermutationSequenceTest {
    private val target = PermutationSequence()

    @Test
    fun test1() {
        assertEquals("213", target.getPermutation(3, 3))
    }

    @Test
    fun test2() {
        assertEquals("2314", target.getPermutation(4, 9))
    }

    @Test
    fun test4() {
        assertEquals("2341", target.getPermutation(4, 10))
    }

    @Test
    fun test3() {
        assertEquals("123", target.getPermutation(3, 1))
    }
}
