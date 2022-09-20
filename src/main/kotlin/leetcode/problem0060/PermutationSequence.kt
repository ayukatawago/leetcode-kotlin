package leetcode.problem0060

class PermutationSequence {
    fun getPermutation(n: Int, k: Int): String {
        val factorial = getFactorial(n)
        val array = List(n) { it + 1 }
        return getPermutationHelper(array, k - 1, factorial)
    }

    private fun getPermutationHelper(intList: List<Int>, k: Int, factorial: Int): String {
        if (intList.size == 1) {
            return intList[k].toString()
        }
        val nextFactorial = factorial / intList.size

        val position = k / nextFactorial
        val remaining = k % nextFactorial
        val remainingList = intList.mapIndexedNotNull { index, i -> if (index == position) null else i }
        val next = getPermutationHelper(remainingList, remaining, nextFactorial)
        return "${intList[position]}$next"
    }

    private fun getFactorial(n: Int): Int =
        if (n == 1) 1 else n * getFactorial(n - 1)
}
