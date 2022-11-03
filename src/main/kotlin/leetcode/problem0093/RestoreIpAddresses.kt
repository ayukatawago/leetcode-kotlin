package leetcode.problem0093

class RestoreIpAddresses {
    fun restoreIpAddresses(s: String): List<String> {
        return getCandidatesSet(s, 0, 0).map { it.joinToString(".") }
    }

    private fun getCandidatesSet(
        s: String,
        index: Int,
        level: Int
    ): Set<List<String>> {
        if (level == 3) {
            val num = s.slice(index..s.lastIndex)
            return if (num.hasValidValue()) {
                setOf(listOf(num))
            } else {
                emptySet()
            }
        }

        val answerSet = mutableSetOf<List<String>>()
        (1..3).forEach { offset ->
            if (index + offset > s.length) return@forEach

            val num = s.slice(index until index + offset)
            if (num.hasValidValue()) {
                val candidates = getCandidatesSet(s, index + offset, level + 1)
                    .filter { it.isNotEmpty() }
                    .map { listOf(num) + it }
                answerSet.addAll(candidates)
            }
        }
        return answerSet
    }

    private fun String.hasValidValue(): Boolean =
        length == 1 || length == 2 && (toInt() in 10..99) || length == 3 && (toInt() in 100..255)
}
