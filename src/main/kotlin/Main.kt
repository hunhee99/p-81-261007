class Person(
    val name: String,
    val age: Int
) {
    init {
        println("Hi, I'm $name and I'm $age years old.")
    }
}

fun main() {
    val person = Person("Alice", 25)
}