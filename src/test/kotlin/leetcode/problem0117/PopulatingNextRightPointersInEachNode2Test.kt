package leetcode.problem0117

import leetcode.shared.Node
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class PopulatingNextRightPointersInEachNode2Test {
    private val target = PopulatingNextRightPointersInEachNode2()

    @Test
    fun test1() {
        val root = Node.from(arrayOf(1, 2, 3, 4, 5, null, 7))
        assertEquals(
            listOf(1, '#', 2, 3, '#', 4, 5, 7, '#'),
            target.connect(root)?.toList()
        )
    }

    @Test
    fun test2() {
        val root = Node.from(emptyArray())
        assertNull(target.connect(root))
    }
}
