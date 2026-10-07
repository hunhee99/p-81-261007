fun main() {
    // data class 사용
    val p1 = Person("Alice", 25)
    val p2 = Person("Alice", 25)

    // 주소값이 아닌 실제 데이터 비교
    // equals() 메서드와 동일
    println(p1 == p2)

    // 자동 생성된 toString() 메서드 사용
    println(p1)
}

