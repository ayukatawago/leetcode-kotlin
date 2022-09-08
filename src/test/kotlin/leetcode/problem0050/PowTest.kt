package leetcode.problem0050

import kotlin.math.roundToInt
import kotlin.test.Test
import kotlin.test.assertEquals

internal class PowTest {
    private val target = Pow()

    @Test
    fun test1() {
        assertEquals(1024.0, target.myPow(2.0, 10))
    }

    @Test
    fun test2() {
        assertEquals(9.261, (target.myPow(2.1, 3) * 10000).roundToInt() / 10000.0)
    }

    @Test
    fun test3() {
        assertEquals(0.25, target.myPow(2.0, -2))
    }

    @Test
    fun test4() {
        assertEquals(1.0, target.myPow(0.44528, 0))
    }

    @Test
    fun test5() {
        assertEquals(1.0, target.myPow(1.0, Int.MIN_VALUE))
    }
}
