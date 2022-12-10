class Day10 {

    fun solutionPart1(input: List<String>): Int {
        var x = 1
        val signalStrength = mutableListOf<Int>()
        var cycle = 0
        val cycleList = listOf(20,60,100,140,180,220)

        input.forEach { command ->
            val (commandCycleCount, xAdjustment) = when {
                command.startsWith("noop") -> Pair(1,0)
                else -> Pair(2,command.substringAfter(" ").toInt())
            }

            repeat(commandCycleCount) {
                cycle++
                if (cycle in cycleList) {
                    signalStrength.add(cycle * x)
                }
            }
            x += xAdjustment
        }
        return signalStrength.sum()
    }

    fun solutionPart2(input: List<String>): Int {
        var spritePosition = 1
        val pixelDrawing = mutableListOf<Char>()
        var cycle = 0
        input.forEach{ command ->
            val (commandCycleCount, xAdjustment) = when {
                command.startsWith("noop") -> Pair(1,0)
                else -> Pair(2,command.substringAfter(" ").toInt())
            }

            repeat(commandCycleCount) {
                cycle++
                val drawingPosition = cycle - ((cycle-1)/40)*40 -1
                val pixel = if ( drawingPosition in (spritePosition-1..spritePosition+1)) '#' else '.'
                pixelDrawing.add(pixel)
            }
            spritePosition += xAdjustment
        }

        pixelDrawing.chunked(40).forEach { println(it) }
        return 1
    }
}