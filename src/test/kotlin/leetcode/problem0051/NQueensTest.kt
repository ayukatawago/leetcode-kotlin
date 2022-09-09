package leetcode.problem0051

import kotlin.test.Test
import kotlin.test.assertEquals

internal class NQueensTest {
    private val target = NQueens()

    @Test
    fun test1() {
        assertEquals(
            listOf(listOf("Q")),
            target.solveNQueens(1)
        )
    }

    @Test
    fun test2() {
        assertEquals(
            listOf(),
            target.solveNQueens(2)
        )
    }

    @Test
    fun test3() {
        assertEquals(
            listOf(),
            target.solveNQueens(3)
        )
    }

    @Test
    fun test4() {
        assertEquals(
            setOf(
                listOf(".Q..", "...Q", "Q...", "..Q."),
                listOf("..Q.", "Q...", "...Q", ".Q..")
            ),
            target.solveNQueens(4).toSet()
        )
    }

    @Test
    fun test5() {
        assertEquals(
            setOf(
                listOf("Q....", "..Q..", "....Q", ".Q...", "...Q."),
                listOf("Q....", "...Q.", ".Q...", "....Q", "..Q.."),
                listOf(".Q...", "...Q.", "Q....", "..Q..", "....Q"),
                listOf(".Q...", "....Q", "..Q..", "Q....", "...Q."),
                listOf("..Q..", "Q....", "...Q.", ".Q...", "....Q"),
                listOf("..Q..", "....Q", ".Q...", "...Q.", "Q...."),
                listOf("...Q.", "Q....", "..Q..", "....Q", ".Q..."),
                listOf("...Q.", ".Q...", "....Q", "..Q..", "Q...."),
                listOf("....Q", ".Q...", "...Q.", "Q....", "..Q.."),
                listOf("....Q", "..Q..", "Q....", "...Q.", ".Q...")
            ),
            target.solveNQueens(5).toSet()
        )
    }
}
