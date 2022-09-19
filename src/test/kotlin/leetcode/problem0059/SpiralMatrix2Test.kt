package leetcode.problem0059

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SpiralMatrix2Test {
    private val taregt = SpiralMatrix2()

    @Test
    fun test1() {
        assertEquals(
            listOf(listOf(1)),
            taregt.generateMatrix(1).map { it.toList() }
        )
    }

    @Test
    fun test2() {
        assertEquals(
            listOf(listOf(1, 2), listOf(4, 3)),
            taregt.generateMatrix(2).map { it.toList() }
        )
    }

    @Test
    fun test3() {
        assertEquals(
            listOf(
                listOf(1, 2, 3),
                listOf(8, 9, 4),
                listOf(7, 6, 5)
            ),
            taregt.generateMatrix(3).map { it.toList() }
        )
    }

    @Test
    fun test4() {
        assertEquals(
            listOf(
                listOf(1, 2, 3, 4),
                listOf(12, 13, 14, 5),
                listOf(11, 16, 15, 6),
                listOf(10, 9, 8, 7)
            ),
            taregt.generateMatrix(4).map { it.toList() }
        )
    }

    @Test
    fun test5() {
        assertEquals(
            listOf(
                listOf(1, 2, 3, 4, 5),
                listOf(16, 17, 18, 19, 6),
                listOf(15, 24, 25, 20, 7),
                listOf(14, 23, 22, 21, 8),
                listOf(13, 12, 11, 10, 9)
            ),
            taregt.generateMatrix(5).map { it.toList() }
        )
    }
}
