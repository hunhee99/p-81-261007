fun main() {

    val agesImmutable = mapOf<String, Int>("Peter" to 24, "Clark" to 31, "Bruce" to 32)

    for ((key, value) in agesImmutable) {
        println("$key is $value years old")
    }

    println("-------------------------------------")

    val ages = mutableMapOf<String, Int>("Peter" to 24, "Clark" to 31, "Bruce" to 32)

    ages["Barry"] = 25

    for ((key, value) in ages) {
        println("$key is $value years old")
    }

}

