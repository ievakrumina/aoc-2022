class Day05 {

    private fun createStackList(input: List<String>): MutableList<MutableList<Char>> {
        val stackRows = input.takeWhile { it.contains('[') }
        return (1..stackRows.last().length step 4).map { index ->
            stackRows.mapNotNull { it.getOrNull(index) }
                .filter { it.isUpperCase() }
                .toMutableList()
        }.toMutableList()
    }

    private fun getCrateCommand(
        input: List<String>,
        str: String = "",
        i: Int
    ): Triple<Int, Int, Int> {
        val t = if (str == "") {
            input[i].split(" ")
        } else {
            str.split(" ")
        }

        val cratesToMove = t[1].toInt()
        val fromCrate = t[3].toInt() - 1
        val toCrate = t[5].toInt() - 1
        return Triple(cratesToMove, fromCrate, toCrate)
    }

    fun solutionPart1(input: List<String>): String {
        val crateStack = createStackList(input)
        input
            .dropWhile { !it.startsWith("move") }
            .map { str -> getCrateCommand(emptyList(), str, 0) }
            .forEach { (toMove, from, to) ->
                val cratesToMove = crateStack[from].take(toMove).reversed()
                repeat(toMove) { crateStack[from].removeFirst() }
                crateStack[to].addAll(0, cratesToMove)
            }
            return crateStack.map { it.first() }.joinToString("")
    }

    fun solutionPart2(input: List<String>): String {
        val crateStack = createStackList(input)
        input
            .dropWhile { !it.startsWith("move") }
            .map { str -> getCrateCommand(emptyList(), str, 0) }
            .forEach { (toMove, from, to) ->
                val cratesToMove = crateStack[from].take(toMove)
                repeat(toMove) { crateStack[from].removeFirst() }
                crateStack[to].addAll(0, cratesToMove)
            }
        return crateStack.joinToString { it.first().toString() }.replace(",", "").replace(" ", "")

    }
}