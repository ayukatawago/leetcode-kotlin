package leetcode.problem0032

import java.util.Stack
import kotlin.math.max

class LongestValidParentheses {
    fun longestValidParentheses(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }

        val stack = Stack<Int>()
        var index = 0
        var maxCount = 0
        stack.push(-1)
        while (index <= s.lastIndex) {
            when (s[index]) {
                '(' -> stack.push(index)
                ')' -> {
                    stack.pop()
                    if (stack.isEmpty()) {
                        stack.push(index)
                    } else {
                        maxCount = max(maxCount, index - stack.peek())
                    }
                }
                else -> throw IllegalStateException()
            }
            index++
        }
        return maxCount
    }
}
