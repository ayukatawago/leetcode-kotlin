package leetcode.problem0118

import kotlin.test.Test
import kotlin.test.assertEquals

class PascalTriangleTest {
    private val target = PascalTriangle()

    @Test
    fun test1() {
        assertEquals(
            listOf(listOf(1)),
            target.generate(1)
        )
    }

    @Test
    fun test2() {
        assertEquals(
            listOf(listOf(1), listOf(1, 1)),
            target.generate(2)
        )
    }

    @Test
    fun test3() {
        assertEquals(
            listOf(listOf(1), listOf(1, 1), listOf(1, 2, 1)),
            target.generate(3)
        )
    }

    @Test
    fun test4() {
        assertEquals(
            listOf(listOf(1), listOf(1, 1), listOf(1, 2, 1), listOf(1, 3, 3, 1)),
            target.generate(4)
        )
    }

    @Test
    fun test5() {
        assertEquals(
            listOf(listOf(1), listOf(1, 1), listOf(1, 2, 1), listOf(1, 3, 3, 1), listOf(1, 4, 6, 4, 1)),
            target.generate(5)
        )
    }
}
