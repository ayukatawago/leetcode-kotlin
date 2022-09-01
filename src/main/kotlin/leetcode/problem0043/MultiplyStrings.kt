package leetcode.problem0043

class MultiplyStrings {
    fun multiply(num1: String, num2: String): String {
        val resultList = num1.reversed().mapIndexed { index, n1 ->
            var carry = 0
            val tmpList = mutableListOf<Int>()
            repeat((0 until index).count()) {
                tmpList.add(0)
            }
            num2.reversed().forEach { n2 ->
                val tmp = (n1 - '0') * (n2 - '0') + carry
                carry = tmp / 10
                tmpList.add(tmp % 10)
            }
            if (carry != 0) {
                tmpList.add(carry)
            }
            tmpList
        }

        val answer = IntArray(resultList[resultList.lastIndex].size + 1) { 0 }
        resultList.forEach {
            it.forEachIndexed { index, i ->
                answer[index + 1] += (answer[index] + i) / 10
                answer[index] = (answer[index] + i) % 10
            }
        }
        val charArray = answer.dropLastWhile { it == 0 }.reversed().map { '0' + it }.toCharArray()

        return if (charArray.isEmpty()) "0" else String(charArray)
    }
}
