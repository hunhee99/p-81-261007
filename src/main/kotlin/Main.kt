fun main() {
    // 스코프 함수
    // also -> 읽기 전용...

    val length = "Hello"
        .also {
            println("Before: $it")
        }.uppercase()
        .also {
            println("After: $it")
        }.length

    println(length)
}