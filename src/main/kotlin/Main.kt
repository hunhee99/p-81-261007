fun main() {
    val result = add(5, 10)
    val result2 = add2(1, 2)
    val result3 = add3(3, 4)

    println("Result = $result")
    println("Result2 = $result2")
    println("Result3 = $result3")
}

// 리턴 타입 명시
fun add(a: Int, b: Int): Int {
    return a + b
}

// 리턴 타입 명시, 표현식으로 작성
fun add2(a: Int, b: Int): Int = a + b

// 표현식으로 작성
fun add3(a: Int, b: Int) = a + b
