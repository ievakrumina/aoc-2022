class Day05 {

    private fun createStackList(input: List<String>): MutableList<MutableList<String>> {
        val crateStack = mutableListOf<MutableList<String>>()
        val indexCrateList = input[input.indexOf("") - 1].trim().last()
        for (i in 0 until indexCrateList.digitToInt()) {
            crateStack.add(mutableListOf())
        }
        for (i in 0..input.indexOf("") - 2) {
            input[i]
                .replace("    ", ".")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "")
                .toCharArray()
                .forEachIndexed { index, s ->
                    if (s != '.') {
                        crateStack[index].add(s.toString())
                    }
                }
        }
        crateStack.map { it.reverse() }
        return crateStack
    }

    fun solutionPart1(input: List<String>): String {
        val crateStack = createStackList(input)

        for (i in input.indexOf("")+1 until input.size) {
            val t = input[i]
                .replace("move ", "")
                .replace("from ", "")
                .replace("to ","")
                .split(" ")

            val cratesToMove = t[0].trim().toInt()
            val fromCrate = t[1].trim().toInt()-1
            val toCrate = t[2].trim().toInt()-1

            for (i in 0 until cratesToMove) {
                if (crateStack[fromCrate].isNotEmpty() || crateStack[fromCrate].last() != "")
                crateStack[toCrate].add(crateStack[fromCrate].last())
                crateStack[fromCrate].removeLast()

            }

        }
        return crateStack.joinToString { it.last() }.replace(",","").replace(" ", "")
    }

    fun solutionPart2(input: List<String>): String {
        val crateStack = createStackList(input)

        for (i in input.indexOf("")+1 until input.size) {
            val t = input[i]
                .replace("move ", "")
                .replace("from ", "")
                .replace("to ","")
                .split(" ")

            val cratesToMove = t[0].trim().toInt()
            val fromCrate = t[1].trim().toInt()-1
            val toCrate = t[2].trim().toInt()-1

            crateStack[toCrate].addAll(crateStack[fromCrate].subList(crateStack[fromCrate].size-cratesToMove, crateStack[fromCrate].size))
            crateStack[fromCrate] = crateStack[fromCrate].subList(0,crateStack[fromCrate].size-cratesToMove)

        }
        return crateStack.joinToString { it.last() }.replace(",","").replace(" ", "")

    }
}