package leetcode.problem0116

import kotlin.test.Test
import kotlin.test.assertEquals

internal class PopulatingNextRightPointersTest {
    private val target = PopulatingNextRightPointers()

    @Test
    fun test1() {
        val root = arrayOf(1, 2, 3, 4, 5, 6, 7)
        val node = Node.from(root)
        assertEquals(
            listOf(1, '#', 2, 3, '#', 4, 5, 6, 7, '#'),
            target.connect(node)?.toList()
        )
    }

    @Test
    fun test2() {
        val root = arrayOf<Int>()
        val node = Node.from(root)
        assertEquals(
            listOf(),
            target.connect(node)?.toList() ?: emptyList()
        )
    }

    @Test
    fun test3() {
        val root = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        val node = Node.from(root)
        assertEquals(
            listOf(1, '#', 2, 3, '#', 4, 5, 6, 7, '#', 8, 9, 10, 11, 12, 13, 14, 15, '#'),
            target.connect(node)?.toList()
        )
    }

    private fun Node.toList(): List<Any> {
        val mutableList = mutableListOf<Any>()
        var leftNode: Node? = this
        while (leftNode != null) {
            var node: Node? = leftNode
            while (node != null) {
                mutableList.add(node.`val`)
                node = node.next
            }
            mutableList.add('#')
            leftNode = leftNode.left
        }

        return mutableList
    }
}
