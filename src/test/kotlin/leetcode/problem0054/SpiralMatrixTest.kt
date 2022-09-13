package leetcode.problem0054

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SpiralMatrixTest {
    private val target = SpiralMatrix()

    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        assertEquals(
            listOf(1, 2, 3, 6, 9, 8, 7, 4, 5),
            target.spiralOrder(matrix)
        )
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12)
        )
        assertEquals(
            listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
            target.spiralOrder(matrix)
        )
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(7),
            intArrayOf(9),
            intArrayOf(6)
        )
        assertEquals(
            listOf(7, 9, 6),
            target.spiralOrder(matrix)
        )
    }

    @Test
    fun test4() {
        val matrix = arrayOf(
            intArrayOf(1, 11),
            intArrayOf(2, 12),
            intArrayOf(3, 13),
            intArrayOf(4, 14),
            intArrayOf(5, 15),
            intArrayOf(6, 16)
        )
        assertEquals(
            listOf(1, 11, 12, 13, 14, 15, 16, 6, 5, 4, 3, 2),
            target.spiralOrder(matrix)
        )
    }
}
