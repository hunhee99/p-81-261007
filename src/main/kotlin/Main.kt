import java.io.File
import java.nio.file.Files
import java.nio.file.StandardCopyOption

fun main() {
    // 예외 처리
    Files.copy(File("a.txt").toPath(), File("a_copy.txt").toPath(), StandardCopyOption.REPLACE_EXISTING)
}