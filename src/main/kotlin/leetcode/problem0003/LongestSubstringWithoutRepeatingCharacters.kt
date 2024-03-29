package leetcode.problem0003

import java.lang.Integer.min

class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxSubstring = ""
        val maxSize = s.toSet().size
        if (maxSize == 1) {
            return 1
        }

        s.indices.forEach { index ->
            val sub = s.substring(index, min(index + maxSize, s.lastIndex + 1))
            if (sub.length < maxSubstring.length) {
                return@forEach
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
        var sub = this
        while (tmp.length < sub.length) {
            sub = sub.dropLast(1)
            if (sub.toSet().size != sub.length)
                continue
            tmp = sub
        }
        return tmp
    }
}
