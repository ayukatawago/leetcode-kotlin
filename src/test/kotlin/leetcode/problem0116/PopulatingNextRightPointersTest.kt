package leetcode.problem0116

import leetcode.shared.Node
import kotlin.test.Test
import kotlin.test.assertEquals

internal class PopulatingNextRightPointersTest {
    private val target = PopulatingNextRightPointers()

    @Test
    fun test1() {
        val root: Array<Int?> = arrayOf(1, 2, 3, 4, 5, 6, 7)
        val node = Node.from(root)
        assertEquals(
            listOf(1, '#', 2, 3, '#', 4, 5, 6, 7, '#'),
            target.connect(node)?.toList()
        )
    }

    @Test
    fun test2() {
        val root = arrayOf<Int?>()
        val node = Node.from(root)
        assertEquals(
            listOf(),
            target.connect(node)?.toList() ?: emptyList()
        )
    }

    @Test
    fun test3() {
        val root: Array<Int?> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        val node = Node.from(root)
        assertEquals(
            listOf(1, '#', 2, 3, '#', 4, 5, 6, 7, '#', 8, 9, 10, 11, 12, 13, 14, 15, '#'),
            target.connect(node)?.toList()
        )
    }
}
