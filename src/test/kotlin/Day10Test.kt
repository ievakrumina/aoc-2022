import org.junit.jupiter.api.Test

internal class Day10Test {

    @Test
    fun testPart1Example() {
        val res = Day10().solutionPart1(Resources.resourceAsList("Day10_Example.txt"))
        kotlin.test.assertEquals(13140, res)
    }

    @Test
    fun testPart1Solution() {
        val res = Day10().solutionPart1(Resources.resourceAsList("Day10.txt"))
        kotlin.test.assertEquals(13760, res)
    }

    @Test
    fun testPart2Example() {
        val res = Day10().solutionPart2(Resources.resourceAsList("Day10_Example.txt"))
        kotlin.test.assertEquals(1, res)
    }

    @Test
    fun testPart2Solution() {
        val res = Day10().solutionPart2(Resources.resourceAsList("Day10.txt"))
        kotlin.test.assertEquals(1, res)
    }
}