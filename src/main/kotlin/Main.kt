fun main() {
    // 기본 매개변수

    // 기본값 적용
    sayHello()

    // Alice를 인자로 함수 호출
    sayHello("Alice")
}

// 매개변수에 디폴트 값을 설정하여 오버로딩 없이 사용 가능
fun sayHello(name: String = "Guest"){
    println("Hello $name")
}