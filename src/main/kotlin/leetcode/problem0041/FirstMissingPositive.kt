package leetcode.problem0041

class FirstMissingPositive {
    fun firstMissingPositive(nums: IntArray): Int {
        val hashMap = HashMap<Int, Int>()
        nums.forEach {
            if (it > 0 && it <= nums.size) {
                hashMap[it] = 1
            }
        }

        var target = 1
        hashMap.keys.sorted().forEach {
            if (it == target) {
                target = it + 1
                return@forEach
            }
            return target
        }

        return hashMap.keys.size + 1
    }
}
