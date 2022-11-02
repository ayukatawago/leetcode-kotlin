package leetcode.problem0093

import kotlin.test.Test
import kotlin.test.assertEquals

internal class RestoreIpAddressesTest {
    private val target = RestoreIpAddresses()

    @Test
    fun test1() {
        assertEquals(
            setOf("255.255.11.135", "255.255.111.35"),
            target.restoreIpAddresses("25525511135").toSet()
        )
    }

    @Test
    fun test2() {
        assertEquals(
            listOf("0.0.0.0"),
            target.restoreIpAddresses("0000")
        )
    }

    @Test
    fun test3() {
        assertEquals(
            setOf("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"),
            target.restoreIpAddresses("101023").toSet()
        )
    }

    @Test
    fun test4() {
        assertEquals(
            setOf("17.216.25.41", "17.216.254.1", "172.16.25.41", "172.16.254.1", "172.162.5.41", "172.162.54.1"),
            target.restoreIpAddresses("172162541").toSet()
        )
    }
}
