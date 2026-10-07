fun main() {
    // immutable 리스트 (원소 추가 불가)
    // val names = listOf("Alice", "Bob", "Charlie")

    // mutable 리스트 (원소 추가 가능)
    val names = mutableListOf("Alice", "Bob", "Charlie")

    // 원소 추가
    names.add("Daniel")

    for (name in names){
        println("Hello $name")
    }
}

