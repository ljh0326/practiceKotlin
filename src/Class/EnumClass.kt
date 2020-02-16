package `class`

/**
 * 열거형,
 * 상태를 구분하기위한 객체들을 이름을 붙여 여러개 생성하고
 * 이중 하나의 상태를 선택하여 나타내기위한 클래스
 *
 * enum객체들은 고유한 속성을 가질 수 있다.
 * 일반클래스처럼 함수도 추가할 수있고, 객체의 선언이 끝난 후 ;을 삽입하고 함수를 만들어야한다.
 * */

fun main() {
    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleep())

    state = State.EAT
    println(state.message)
}

enum class State(val message: String){
    SING("노래를 부른다."),
    EAT("밥을 먹는다."),
    SLEEP("잠을 처잔다.");

    //잠을 자는지 파악하는 함수
   fun isSleep() = this == State.SLEEP
}