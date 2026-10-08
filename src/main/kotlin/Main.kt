fun main() {
    // 스코프 함수
    // apply => this를 받고 객체를 반환
    // let => it를 받고 람다의 결과를 반환
    // also => it를 받고 객체를 반환
    // run => this를 받고 람다의 결과를 반환

    // run
    val num = 5
    val rst = num.run {
        this * 2 + 10
    }

    println(rst)
}