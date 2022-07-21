package leetcode.problem0069

import kotlin.math.sqrt
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SqrtXTest {
    private val target = SqrtX()

    @Test
    fun test1() {
        assertEquals(0, target.mySqrt(0))
        assertEquals(1, target.mySqrt(1))
        assertEquals(2, target.mySqrt(4))
        assertEquals(3, target.mySqrt(9))
        assertEquals(4, target.mySqrt(16))
        assertEquals(5, target.mySqrt(25))
        assertEquals(10, target.mySqrt(100))
    }

    @Test
    fun test2() {
        assertEquals(1, target.mySqrt(3))
        assertEquals(2, target.mySqrt(5))
        assertEquals(2, target.mySqrt(6))
        assertEquals(2, target.mySqrt(7))
        assertEquals(2, target.mySqrt(8))
        assertEquals(12, target.mySqrt(160))
        assertEquals(sqrt(2147395599.0).toInt(), target.mySqrt(2147395599))
    }
}
