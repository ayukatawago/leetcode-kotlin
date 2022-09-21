package leetcode.problem0062

import kotlin.test.Test
import kotlin.test.assertEquals

internal class UniquePathsTest {
    private val target = UniquePaths()

    @Test
    fun test1() {
        assertEquals(28, target.uniquePaths(3, 7))
    }

    @Test
    fun test2() {
        assertEquals(3, target.uniquePaths(3, 2))
    }
}
