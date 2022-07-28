package leetcode.problem0067

import kotlin.test.Test
import kotlin.test.assertEquals

internal class AddBinaryTest {
    private val target = AddBinary()

    @Test
    fun test1() {
        assertEquals("100", target.addBinary("11", "1"))
    }

    @Test
    fun test2() {
        assertEquals("10101", target.addBinary("1010", "1011"))
    }
}
