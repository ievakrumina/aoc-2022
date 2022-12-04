class Day04 {

    fun solutionPart1(input: List<String>): Int {
        return input
            .map { it.replace(",", "-").split("-") }.count {
                (it[0].trim().toInt() <= it[2].trim().toInt() &&
                        it[1].trim().toInt() >= it[3].trim().toInt()) ||
                        it[2].trim().toInt() <= it[0].trim().toInt() &&
                        it[3].trim().toInt() >= it[1].trim().toInt()
            }
    }

    fun solutionPart2(input: List<String>): Int {
        val notCoverPairs = input
            .map { it.replace(",", "-").split("-") }
            .count {
                it[2].trim().toInt() > it[1].trim().toInt() ||
                        it[0].trim().toInt() > it[3].trim().toInt()
            }

        return input.size - notCoverPairs
    }
}