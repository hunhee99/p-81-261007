fun main() {
    // 스코프 함수
    // with
    val p1 = Person("Alice", 25, 55.5, 3000)

    with(p1) {
        increaseAge(5)
        increaseWeight(3.5)
        increaseSalary(10000)
    }

    p1.getInfo()
}