fun main() {
    // lazy
    println(lazyValue)
    println(lazyValue)
}

val lazyValue: String by lazy {
    println("initializing")
    "Hello"
}