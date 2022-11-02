package leetcode.problem0093

class RestoreIpAddresses {
    fun restoreIpAddresses(s: String): List<String> {
        return getCandidatesSet(s).filter { it.size == 4 }.map { it.joinToString(".") }
    }

    private fun getCandidatesSet(s: String): Set<List<String>> {
        if (s.isEmpty()) {
            return emptySet()
        }
        if (s.length == 1) {
            return setOf(listOf(s))
        }
        if (s.length == 2) {
            return if (s.startsWith('0')) {
                setOf(listOf(s[0].toString(), s[1].toString()))
            } else {
                setOf(listOf(s[0].toString(), s[1].toString()), listOf(s))
            }
        }

        if (s.startsWith('0')) {
            return createCandidateSet(s, 1)
        }

        val answer = if (s.length == 3 && s.toInt() <= 255) {
            mutableSetOf(listOf(s))
        } else {
            mutableSetOf()
        }

        if (s.slice(0..2).toInt() <= 255) {
            answer += createCandidateSet(s, 3)
        }

        answer += createCandidateSet(s, 2)
        answer += createCandidateSet(s, 1)

        return answer
    }

    private fun createCandidateSet(s: String, count: Int): Set<List<String>> =
        getCandidatesSet(s.drop(count)).filter { it.size < 4 }.map { candidate ->
            listOf(s.slice(0 until count)) + candidate
        }.toSet()
}
