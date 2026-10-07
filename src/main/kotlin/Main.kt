fun main() {
    // 확장 함수
    val name: String = "Alice"
    val intList = listOf(1, 2, 3, 4, 5)

    // 추가한 확장 함수: greet()
    name.greet()    // Hello, Alice

    println("--------------------")

    // 기본 제공 메서드
    val rst = intList.average()
    println(rst)

    println("--------------------")
    
    // 추가한 확장 함수: square()
    val squaredIntList = intList.square()
    squaredIntList.forEach { println(it) }
}

// String 클래스에 greet 확장 함수 추가
fun String.greet(){
    println("Hello, $this")
}

// Int List 클래스에 square 확장 함수 추가
fun List<Int>.square(): List<Int> {
    val rst = this.map{ it * it }
    return rst
}