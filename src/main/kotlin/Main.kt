fun main() {
    // immutable 리스트 (원소 추가 불가) [불변이 기본]
    // val names = listOf("Alice", "Bob", "Charlie")

    // mutable 리스트 (원소 추가 가능)
    val names = mutableListOf<String>("Alice", "Bob", "Charlie")

    // 원소 추가
    names.add("Daniel")

    for (name in names){
        println("Hello $name")
    }
}

