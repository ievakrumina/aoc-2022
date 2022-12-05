import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Day05Test {
    @Test
    fun testPart1Example() {
        val res = Day05().solutionPart1(Resources.resourceAsList("Day05_Example.txt"))
        kotlin.test.assertEquals("CMZ", res)
    }

    @Test
    fun testPart1Solution() {
        val res = Day05().solutionPart1(Resources.resourceAsList("Day05.txt"))
        kotlin.test.assertEquals("CNSZFDVLJ", res)
    }

    @Test
    fun testPart2Example() {
        val res = Day05().solutionPart2(Resources.resourceAsList("Day05_Example.txt"))
        kotlin.test.assertEquals("MCD", res)
    }

    @Test
    fun testPart2Solution() {
        val res = Day05().solutionPart2(Resources.resourceAsList("Day05.txt"))
        kotlin.test.assertEquals("QNDWLMGNS", res)
    }
}