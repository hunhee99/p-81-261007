fun main() {
    // Companion Object

    MathUtil.square(5)
        .also(::println)

    MathUtil.PI
        .also(::println)
}