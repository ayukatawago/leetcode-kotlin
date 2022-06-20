package leetcode.problem0074

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class Search2DMatrixTest {
    private val target = Search2DMatrix()

    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 60)
        )
        assertTrue(target.searchMatrix(matrix, 3))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 60)
        )
        assertFalse(target.searchMatrix(matrix, 13))
    }

    @Test
    fun test3() {
        val matrix = arrayOf(intArrayOf(1))
        assertTrue(target.searchMatrix(matrix, 1))
    }

    @Test
    fun test4() {
        val matrix = arrayOf(intArrayOf(1, 3))
        assertTrue(target.searchMatrix(matrix, 3))
    }
}
