package leetcode.problem0076

class MinimumWindowSubstring {
    fun minWindow(s: String, t: String): String {
        var minIndex = -1
        var minLength = Int.MAX_VALUE

        val targetMap = HashMap<Char, Int>()
        t.forEach {
            if (targetMap.containsKey(it)) {
                targetMap[it] = requireNotNull(targetMap[it]) + 1
            } else {
                targetMap[it] = 1
            }
        }

        var leftPointer = 0
        var rightPointer = 0

        val hashMap = HashMap<Char, Int>()
        hashMap[s[0]] = 1

        while (leftPointer <= s.lastIndex) {
            if (targetMap.entries.all { hashMap.containsKey(it.key) && requireNotNull(hashMap[it.key]) >= it.value }) {
                if (rightPointer - leftPointer < minLength) {
                    minIndex = leftPointer
                    minLength = rightPointer - leftPointer
                }

                val leftChar = s[leftPointer]
                hashMap[leftChar] = requireNotNull(hashMap[leftChar]) - 1
                leftPointer++
            } else if (rightPointer < s.lastIndex) {
                rightPointer++
                val rightChar = s[rightPointer]
                if (hashMap.containsKey(rightChar)) {
                    hashMap[rightChar] = requireNotNull(hashMap[rightChar]) + 1
                } else {
                    hashMap[rightChar] = 1
                }
            } else {
                val leftChar = s[leftPointer]
                hashMap[leftChar] = requireNotNull(hashMap[leftChar]) - 1
                leftPointer++
            }
        }

        return if (minIndex == -1) {
            ""
        } else {
            s.slice(minIndex..minIndex + minLength)
        }
    }
}
