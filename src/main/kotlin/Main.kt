fun main() {
    // map, forEach
    val names = listOf("Alice", "Bob", "Charlie")

    names.map {
        "Hello, $it"
    }
        .forEach(::println)
}