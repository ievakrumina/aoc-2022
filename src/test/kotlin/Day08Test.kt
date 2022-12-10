import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day08Test {

    @Test
    fun testPart1Example() {
        val res = Day08().solutionPart1(Resources.resourceAsList("Day08_Example.txt"))
        assertEquals(21, res)
    }

    @Test
    fun testPart1Solution() {
        val res = Day08().solutionPart1(Resources.resourceAsList("Day08.txt"))
        kotlin.test.assertEquals(1779, res)
    }

    @Test
    fun testPart2Example() {
        val res = Day08().solutionPart2(Resources.resourceAsList("Day08_Example.txt"))
        kotlin.test.assertEquals(8, res)
    }

    @Test
    fun testPart2Solution() {
        val res = Day08().solutionPart2(Resources.resourceAsList("Day08.txt"))
        kotlin.test.assertEquals(172224, res)
    }
}