package leetcode.problem0130

import kotlin.test.Test
import kotlin.test.assertEquals

class SurroundedRegionsTest {
    private val target = SurroundedRegions()

    @Test
    fun test1() {
        val board = arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'O', 'X'),
            charArrayOf('X', 'X', 'O', 'X'),
            charArrayOf('X', 'O', 'X', 'X'),
        )
        val output = arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'X', 'X'),
        )
        target.solve(board)
        compareBoard(board, output)
    }

    @Test
    fun test2() {
        val board = arrayOf(charArrayOf('X'))
        val output = arrayOf(charArrayOf('X'))
        target.solve(board)
        compareBoard(board, output)
    }

    private fun compareBoard(board: Array<CharArray>, output: Array<CharArray>) {
        (0..board.lastIndex).forEach { row ->
            (0..board[row].lastIndex).forEach { column ->
                assertEquals(output[row][column], board[row][column], "Match error $row-$column")
            }
        }
    }
}
