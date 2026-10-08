fun main() {
    // 스코프 함수

    // 기존
    val person1 = Person()
    person1.name = "Bob"
    person1.age = 509

    person1.prinInfo()

    // apply
    val person2 = Person().apply {
        name = "Alice"
        age = 30
    }

    person2.prinInfo()
}