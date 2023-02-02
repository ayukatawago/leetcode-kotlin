package leetcode.problem0125

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val joinedString = s.filter { it.isLetterOrDigit() }.lowercase()

        var result = true
        var index = 0
        while (result && index < joinedString.length / 2) {
            result = joinedString[index] == joinedString[joinedString.lastIndex - index]
            index++
        }
        return result
    }
}
