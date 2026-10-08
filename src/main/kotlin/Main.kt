fun main() {
    // 스코프 함수

    val name: String? = "hello"

    val len = name?.length ?: 0
    println(len)

    val rst = name?.let {
        println(it.length)
        10
    }

    println(rst)
}