package leetcode.problem0011

import kotlin.test.Test
import kotlin.test.assertEquals

class ContainerWithMostWaterTest {
    private val target = ContainerWithMostWater()

    @Test
    fun test1() {
        val input = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        assertEquals(49, target.maxArea(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(1, 1)
        assertEquals(1, target.maxArea(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(2, 3, 4, 5, 18, 17, 6)
        assertEquals(17, target.maxArea(input))
    }

    @Test
    fun test4() {
        val input = intArrayOf(
            76,
            155,
            15,
            188,
            180,
            154,
            84,
            34,
            187,
            142,
            22,
            5,
            27,
            183,
            111,
            128,
            50,
            58,
            2,
            112,
            179,
            2,
            100,
            111,
            115,
            76,
            134,
            120,
            118,
            103,
            31,
            146,
            58,
            198,
            134,
            38,
            104,
            170,
            25,
            92,
            112,
            199,
            49,
            140,
            135,
            160,
            20,
            185,
            171,
            23,
            98,
            150,
            177,
            198,
            61,
            92,
            26,
            147,
            164,
            144,
            51,
            196,
            42,
            109,
            194,
            177,
            100,
            99,
            99,
            125,
            143,
            12,
            76,
            192,
            152,
            11,
            152,
            124,
            197,
            123,
            147,
            95,
            73,
            124,
            45,
            86,
            168,
            24,
            34,
            133,
            120,
            85,
            81,
            163,
            146,
            75,
            92,
            198,
            126,
            191
        )
        assertEquals(18048, target.maxArea(input))
    }
}
