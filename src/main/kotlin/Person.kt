// class
class Person (
    var name: String,
    var age: Int,
    var weight: Double,
    var salary: Int
){
    fun increaseAge(years: Int) {
        age += years
    }

    fun increaseWeight(kg: Double) {
        weight += kg
    }

    fun increaseSalary(amount: Int) {
        salary += amount
    }

    fun getInfo() {
        println("이름: $name, 나이: $age, 몸무게: $weight, 연봉: $salary")
    }
}