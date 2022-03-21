package leetcode.problem0003

import java.lang.Integer.min

class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxSubstring = ""
        val maxSize = s.toSet().size
        if (maxSize == 1) {
            return 1
        }

        s.forEachIndexed { index, char ->
            val sub = s.substring(index, min(index + maxSize, s.lastIndex + 1))
            if (sub.length < maxSubstring.length) {
                return@forEachIndexed
            }
            sub.dropLastWhileDuplicate().let {
                if (it.length > maxSubstring.length) {
                    maxSubstring = it
                }
            }
            if (maxSubstring.length == maxSize) {
                return maxSize
            }
        }
        return maxSubstring.length
    }

    private fun String.dropLastWhileDuplicate(): String {
        if (length == toSet().size) {
            return this
        }
        var tmp = ""
        for (index in lastIndex downTo 0) {
            if (tmp.length > index) {
                break
            }
            val sub = substring(0, index)

            if (sub.toSet().size != sub.length)
                continue
            tmp = sub
        }
        return tmp
    }
}
