fun main() {
    // when 문 (switch 대체)
    val day = 3

    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "Invalid Day"
    }

    println("Day: $dayName")
}