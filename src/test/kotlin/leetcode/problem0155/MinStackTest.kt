package leetcode.problem0155

import kotlin.test.Test
import kotlin.test.assertEquals

internal class MinStackTest {
    private val target = MinStack()

    @Test
    fun test1() {
        target.push(-2)
        target.push(0)
        target.push(-3)
        assertEquals(-3, target.getMin())
        target.pop()
        assertEquals(0, target.top())
        assertEquals(-2, target.getMin())
    }
}
