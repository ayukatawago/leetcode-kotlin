package leetcode.problem0009

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        val numberString = x.toString()
        return numberString == numberString.reversed()
    }
}
