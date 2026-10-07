fun main() {
    // 람다 표현식
    val names = listOf("Alice", "Bob", "Charlie")

    // 매개변수 표현
    names.forEach { name -> println(name)}

    println("----------------")

    // 매개변수 it으로 대체
    names.forEach{println(it)}
}

