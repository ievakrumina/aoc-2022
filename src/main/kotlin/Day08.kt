class Day08 {

    fun solutionPart1(input: List<String>): Int {
        var visibleTreeCounter = 0
        input.forEachIndexed { columnIndex, column ->
            val columnList = column.toCharArray().map { it.toString().toInt() }
            columnList.forEachIndexed { rowIndex, item ->
                when {
                    //Edge and side
                    rowIndex == 0 && columnIndex == 0 -> visibleTreeCounter++
                    rowIndex == 0 && columnIndex == input.size - 1 -> visibleTreeCounter++
                    rowIndex == columnList.size - 1 && columnIndex == 0 -> visibleTreeCounter++
                    rowIndex == columnList.size - 1 && columnIndex == input.size - 1 -> visibleTreeCounter++
                    rowIndex == 0 -> visibleTreeCounter++
                    rowIndex == columnList.size - 1 -> visibleTreeCounter++
                    columnIndex == 0 -> visibleTreeCounter++
                    columnIndex == input.size - 1 -> visibleTreeCounter++
                    else -> {
                        val checkTop = input
                            .filterIndexed { index, _ -> index < columnIndex }
                            .map { it[rowIndex].toString().toInt() }
                            .find { it >= item }
                        val checkBottom = input
                            .filterIndexed { index, _ -> index > columnIndex }
                            .map { it[rowIndex].toString().toInt() }
                            .find { it >= item }

                        val checkLeft = columnList
                            .subList(0, rowIndex)
                            .find { it >= item }

                        val checkRight = columnList
                            .subList(rowIndex + 1, columnList.size)
                            .find { it >= item }
                        if (checkTop == null || checkBottom == null ||
                            checkLeft == null || checkRight == null
                        ) {
                            visibleTreeCounter++
                        }
                    }


                }
            }
        }
        return visibleTreeCounter
    }

    fun solutionPart2(input: List<String>): Int {
        var maxVisibleTrees = 0
        input.forEachIndexed { columnIndex, column ->
            val columnList = column.toCharArray().map { it.toString().toInt() }
            columnList.forEachIndexed { rowIndex, item ->
                val checkTop = input
                    .filterIndexed { index, _ -> index < columnIndex }
                    .map { it[rowIndex].toString().toInt() }
                    .takeLastWhile { it < item }
                val topSize = if ( checkTop.isEmpty()) {
                    0
                } else if (input
                        .filterIndexed { index, _ -> index < columnIndex }
                        .map { it[rowIndex].toString().toInt() }.size > checkTop.size)  {
                    checkTop.size + 1
                } else {
                    checkTop.size
                }

                val checkBottom = input
                    .filterIndexed { index, _ -> index > columnIndex }
                    .map { it[rowIndex].toString().toInt() }
                    .takeWhile { it < item }

                val bottomSize = if ( checkBottom.isEmpty()) {
                    0
                } else if ( input
                        .filterIndexed { index, _ -> index > columnIndex }
                        .map { it[rowIndex].toString().toInt() }.size > checkBottom.size) {
                    checkBottom.size + 1
                } else {
                    checkBottom.size
                }

                val checkLeft = columnList
                    .subList(0, rowIndex)
                    .takeLastWhile { it < item }

                val leftSize = if (checkLeft.isEmpty()){
                    0
                } else if (columnList
                        .subList(0, rowIndex).size > checkLeft.size) {
                    checkLeft.size + 1
                } else {
                    checkLeft.size
                }


                val checkRight = columnList
                    .subList(rowIndex + 1, columnList.size)
                    .takeWhile { it < item }

                val rightSize = if  (checkRight.isEmpty()) {
                    0
                } else if (columnList
                        .subList(rowIndex + 1, columnList.size).size > checkRight.size)  {
                    checkRight.size + 1
                } else {
                    checkRight.size
                }

                val visibleTrees = bottomSize * topSize * leftSize * rightSize
                if (visibleTrees > maxVisibleTrees) maxVisibleTrees = visibleTrees
            }
        }
        return maxVisibleTrees

    }
}