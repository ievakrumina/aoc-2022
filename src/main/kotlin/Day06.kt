class Day06 {

    private fun String.allUnique(): Boolean = all(hashSetOf<Char>()::add)

    fun solutionPart1(input: String): Int {
        return (0..input.length-4)
            .map {
                Pair(input.substring(it..it+3).allUnique(), it + 4)
            }
            .first { it.first }
            .second
    }

    fun solutionPart2(input: String): Int {
        return (0..input.length-14)
            .map {
                Pair(input.substring(it..it+13).allUnique(), it + 14)
            }
            .first { it.first }
            .second

    }
}