package leetcode.problem0067

class AddBinary {
    fun addBinary(a: String, b: String): String {
        val answer = StringBuilder()

        var index = 0
        var carry = 0
        while (index < a.length || index < b.length) {
            val valueA = if (index <= a.lastIndex) a[a.lastIndex - index] - '0' else 0
            val valueB = if (index <= b.lastIndex) b[b.lastIndex - index] - '0' else 0
            val sum = valueA + valueB + carry
            answer.append(sum % 2)
            carry = sum / 2
            index++
        }
        if (carry > 0) {
            answer.append(1)
        }
        return answer.toString().reversed()
    }
}
