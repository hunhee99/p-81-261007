fun main() {
    // 타입 체크와 캐스팅
    val obj: Any = "Hello"

    if (obj is String) {
        println(obj.length)
    }
}