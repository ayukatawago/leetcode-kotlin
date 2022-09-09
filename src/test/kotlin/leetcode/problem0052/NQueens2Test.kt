package leetcode.problem0052

import kotlin.test.Test
import kotlin.test.assertEquals

internal class NQueens2Test {
    private val target = NQueens2()

    @Test
    fun test1() {
        assertEquals(1, target.totalNQueens(1))
    }

    @Test
    fun test2() {
        assertEquals(0, target.totalNQueens(2))
    }

    @Test
    fun test3() {
        assertEquals(0, target.totalNQueens(3))
    }

    @Test
    fun test4() {
        assertEquals(2, target.totalNQueens(4))
    }

    @Test
    fun test5() {
        assertEquals(10, target.totalNQueens(5))
    }
}
