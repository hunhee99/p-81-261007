fun main() {
    // 컬렉션 필터링
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    val rst = numbers.filter { it % 2 == 0 }

    rst.forEach { println(it) }
}