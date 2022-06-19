package leetcode.problem0020

import java.util.Stack

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        s.forEach {
            when (it) {
                '(', '[', '{' -> stack.push(it)
                ')' -> if (stack.isEmpty() || stack.pop() != '(') {
                    return false
                }
                ']' -> if (stack.isEmpty() || stack.pop() != '[') {
                    return false
                }
                '}' -> if (stack.isEmpty() || stack.pop() != '{') {
                    return false
                }
                else -> Unit
            }
        }
        return stack.isEmpty()
    }
}
