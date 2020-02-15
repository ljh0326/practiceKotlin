package conditionFlow

import kotlin.coroutines.coroutineContext

fun main() {
    var a = 7
    if(a > 10){
        println("10 이상")
    }else{
        print("거짓")
    }

    //자료형 체크 연산자
    //좌측 변수가 우측 자료형에 해당하는지 확인해주고 형변환까지 해
    a is Int

    doWhen(1)
    doWhen("hun")
    doWhen(12L)
    doWhen(3.14150)
    doWhen("Kotlin")

}

//When
//하나의 변수를 여러개의 값과 바꿀수있음 switch 진화형
//등호나 부등호의 사용은 불가능함
//먼저 부합하는 조건 실행함
fun doWhen(a: Any){
    when(a){
        1 -> println("점수 1입니다.")
        "hun" -> println(" hun이 코틀린 연습합니다. ")
        is Long -> println("Long 타입입니다.")
        !is String -> println("스트링 타입이 아닙니다.")
        else -> println("어떤 조건도 만족 x")
    }
}
