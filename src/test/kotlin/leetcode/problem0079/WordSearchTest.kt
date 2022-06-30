package leetcode.problem0079

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class WordSearchTest {
    private val target = WordSearch()

    @Test
    fun test1() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E')
        )
        assertTrue(target.exist(board, "ABCCED"))
    }

    @Test
    fun test2() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E')
        )
        assertTrue(target.exist(board, "SEE"))
    }

    @Test
    fun test3() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E')
        )
        assertFalse(target.exist(board, "ABCB"))
    }

    @Test
    fun test4() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'), charArrayOf('S', 'F', 'C', 'S'), charArrayOf('A', 'D', 'E', 'E')
        )
        assertFalse(target.exist(board, "EEE"))
    }

    @Test
    fun test5() {
        val board = arrayOf(
            charArrayOf('a', 'a', 'a', 'a'), charArrayOf('a', 'a', 'a', 'a'), charArrayOf('a', 'a', 'a', 'a')
        )
        assertFalse(target.exist(board, "aaaaaaaaaaaaa"))
    }
}
