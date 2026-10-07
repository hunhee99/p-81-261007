fun main() {
    // 객체 싱글톤

    val ns1 = NonSingleton()
    val ns2 = NonSingleton()

    println(ns1)
    println(ns2)
    // 다른 객체로 false 출력
    println(ns1 === ns2)

    println("---------------------------")

    val s1 = Singleton
    val s2 = Singleton

    println(s1)
    println(s2)
    // 하나의 객체만 생성되어 공유하므로 true 출력
    println(s1 === s2)
}

class NonSingleton {}

object Singleton {}
