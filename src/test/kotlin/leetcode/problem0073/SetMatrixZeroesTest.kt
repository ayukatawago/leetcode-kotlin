package leetcode.problem0073

import kotlin.test.Test
import kotlin.test.assertEquals

internal class SetMatrixZeroesTest {
    private val target = SetMatrixZeroes()

    @Test
    fun test1() {
        val matrix = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
        target.setZeroes(matrix)
        assertEquals(
            listOf(
                listOf(1, 0, 1), listOf(0, 0, 0), listOf(1, 0, 1)
            ),
            matrix.map { it.toList() }
        )
    }

    @Test
    fun test2() {
        val matrix = arrayOf(intArrayOf(0, 1, 2, 0), intArrayOf(3, 4, 5, 2), intArrayOf(1, 3, 1, 5))
        target.setZeroes(matrix)
        assertEquals(
            listOf(
                listOf(0, 0, 0, 0), listOf(0, 4, 5, 0), listOf(0, 3, 1, 0)
            ),
            matrix.map { it.toList() }
        )
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 0, 7, 8),
            intArrayOf(0, 10, 11, 12),
            intArrayOf(13, 14, 15, 0)
        )
        target.setZeroes(matrix)
        assertEquals(
            listOf(
                listOf(0, 0, 3, 0),
                listOf(0, 0, 0, 0),
                listOf(0, 0, 0, 0),
                listOf(0, 0, 0, 0)
            ),
            matrix.map { it.toList() }
        )
    }

    @Test
    fun test4() {
        val matrix = arrayOf(
            intArrayOf(1, 0),
        )
        target.setZeroes(matrix)
        assertEquals(
            listOf(listOf(0, 0)),
            matrix.map { it.toList() }
        )
    }
}
