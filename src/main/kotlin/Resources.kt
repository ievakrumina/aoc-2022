import java.io.File
import java.net.URI

internal object Resources {

    fun resourceAsList(fileName: String): List<String> =
        File(fileName.toURI()).readLines()

    fun resourceAsListOfInt(fileName: String): List<Int> =
        resourceAsList(fileName).map { it.toInt() }

    fun resourceAsString(fileName: String): String = File(fileName.toURI()).readText()

    private fun String.toURI(): URI =
        Resources.javaClass.classLoader
            .getResource(this)?.toURI() ?:
        throw IllegalArgumentException("Cannot find Resource: $this")
}