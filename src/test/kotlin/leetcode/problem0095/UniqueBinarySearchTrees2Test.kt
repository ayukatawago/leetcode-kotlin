package leetcode.problem0095

import kotlin.test.Test
import kotlin.test.assertEquals

internal class UniqueBinarySearchTrees2Test {
    private val target = UniqueBinarySearchTrees2()

    @Test
    fun test1() {
        assertEquals(
            listOf(listOf(1)),
            target.generateTrees(1).map { it?.toList() }
        )
    }

    @Test
    fun test2() {
        assertEquals(
            setOf(
                listOf(1, null, 2),
                listOf(2, 1)
            ),
            target.generateTrees(2).map { it?.toList() }.toSet()
        )
    }

    @Test
    fun test3() {
        assertEquals(
            setOf(
                listOf(1, null, 3, null, null, 2),
                listOf(1, null, 2, null, null, null, 3),
                listOf(2, 1, 3),
                listOf(3, 2, null, 1),
                listOf(3, 1, null, null, 2)
            ),
            target.generateTrees(3).map { it?.toList() }.toSet()
        )
    }
}
