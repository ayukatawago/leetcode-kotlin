package leetcode.problem0072

import kotlin.test.Test
import kotlin.test.assertEquals

internal class EditDistanceTest {
    private val target = EditDistance()

    @Test
    fun test1() {
        assertEquals(3, target.minDistance("horse", "ros"))
    }

    @Test
    fun test2() {
        assertEquals(5, target.minDistance("intention", "execution"))
    }
}
