package leetcode.problem0089

class GrayCode {
    fun grayCode(n: Int): List<Int> {
        val arrayList = arrayListOf<Int>()
        (0 until (1.shl(n))).forEach { index ->
            arrayList.add(index xor index.shr(1))
        }
        return arrayList
    }
}
