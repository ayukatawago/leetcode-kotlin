package leetcode.problem0017

import kotlin.test.Test
import kotlin.test.assertEquals

class LetterCombinationsOfPhoneNumberTest {
    private val target = LetterCombinationsOfPhoneNumber()

    @Test
    fun test1() {
        assertEquals(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), target.letterCombinations("23"))
    }

    @Test
    fun test2() {
        assertEquals(listOf(), target.letterCombinations(""))
    }

    @Test
    fun test3() {
        assertEquals(listOf("a", "b", "c"), target.letterCombinations("2"))
    }
}
