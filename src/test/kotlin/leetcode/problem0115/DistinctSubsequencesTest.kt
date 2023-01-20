package leetcode.problem0115

import kotlin.test.Test
import kotlin.test.assertEquals

class DistinctSubsequencesTest {
    private val target = DistinctSubsequences()

    @Test
    fun test1() {
        assertEquals(3, target.numDistinct("rabbbit", "rabbit"))
    }

    @Test
    fun test2() {
        assertEquals(5, target.numDistinct("babgbag", "bag"))
    }

    @Test
    fun test3() {
        assertEquals(
            700531452,
            target.numDistinct(
                "adbdadeecadeadeccaeaabdabdbcdabddddabcaaadbabaaedeeddeaeebcdeabcaaaeeaeeabcddcebddebeebedaecccbdcbcedbdaeaedcdebeecdaaedaacadbdccabddaddacdddc",
                "bcddceeeebecbc"
            )
        )
    }
}
