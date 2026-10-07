fun main() {
    // 자바로 만든 객체도 사용 가능
    val personJava = Person("Java")
    // 코틀린으로 만든 객체
    val personKotlin = PersonKotlin("Kotlin")

    personJava.greet()
    personKotlin.greet()
}


class PersonKotlin(
    val name: String
) {
    fun greet() {
        println("Hello, my name is $name")
    }
}

