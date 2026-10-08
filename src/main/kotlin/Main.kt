fun main() {
    // elvis 연산자 (?:)
    val name: String? = null

    println("Hello, ${name ?: "Guest"}")
}