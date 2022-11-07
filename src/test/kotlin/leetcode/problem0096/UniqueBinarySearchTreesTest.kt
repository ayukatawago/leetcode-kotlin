package leetcode.problem0096

import kotlin.test.Test
import kotlin.test.assertEquals

internal class UniqueBinarySearchTreesTest {
    private val target = UniqueBinarySearchTrees()

    @Test
    fun test1() {
        assertEquals(1, target.numTrees(1))
    }

    @Test
    fun test2() {
        assertEquals(2, target.numTrees(2))
    }

    @Test
    fun test3() {
        assertEquals(5, target.numTrees(3))
    }
}
