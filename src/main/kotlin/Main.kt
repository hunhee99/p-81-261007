fun main() {
    // null 처리
    // null일수도 있는 변수에는 ?를 통해 명시해야함
    val name: String? = null

    // elvis 연산자 ?: (null이라면 오른쪽 값 선택)
    println(name?.length ?: "Name is null")

    val name1: String = "John"
    val name2: String? = null

    println(name1.length)

    // Java식 null 처리
    if (name2 != null) {
        println(name2.length)
    }

    // Kotlin식 null 처리
    println(name2?.length)
}

