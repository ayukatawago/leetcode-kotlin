package leetcode.problem0048

import kotlin.test.Test
import kotlin.test.assertEquals

internal class RotateImageTest {
    private val target = RotateImage()

    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        )
        target.rotate(matrix)
        assertEquals(
            listOf(
                listOf(7, 4, 1),
                listOf(8, 5, 2),
                listOf(9, 6, 3)
            ),
            matrix.map { it.toList() }
        )
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16)
        )
        target.rotate(matrix)
        assertEquals(
            listOf(
                listOf(15, 13, 2, 5),
                listOf(14, 3, 4, 1),
                listOf(12, 6, 8, 9),
                listOf(16, 7, 10, 11)
            ),
            matrix.map { it.toList() }
        )
    }
}
