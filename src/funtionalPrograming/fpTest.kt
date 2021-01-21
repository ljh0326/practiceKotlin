package funtionalPrograming

/**
 * 순수함수(사이드 이펙트가 없는함수)
 * 동일한 입력에 항상 동일한 결과를 반환하는함수
 * 값이 예측이 가능해야한다.
 *
 * 조건
 * 1. 같은 인자에 대하여 같은 값을 반환
 * 2. 함수 외부의 어떤 상태도 바꾸지 않는다.
 */
// 1과 2를 넣으면 100만번 반복해도 3이나온다.
// 함수외부의 어떤 상태도 바꾸지 않는다. 처리루틴이 외부에 c라는 변수가있어서 파라미터로 c입력받고 c에 입력하면 외부 변수 변경하는거야 이거 순수함수아
fun sum(a: Int, b: Int) = a + b


//============================
//순수함수 아닌거
//============================
// 변수 테스트는 user.grade() 실행결과에 따라 달라
fun check() {
    val test = User.grade()
    if (test != null) process(test)
}

const val grobal = 10;

// 외부의 값을 조정함
fun noPureFunction(a: Int, b:Int): Int{
    return a + b + grobal
}

//============================

fun process(test: String){
    return Unit
}

class User {
    companion object {
        val grade = "A"

        fun grade(): String {
            return grade
        }
    }
}

//============================
// 람다식 다양한 표햔
//============================
val sum: (Int, Int) -> Int = { x,y -> x + y}
val mul = {x:Int, y: Int -> x * y}
val add: (Int) -> Int = { it + 1 }

fun inc(x: Int): Int {
    return x + 1
}

fun higherFunc(name: String, body: (Int) -> Int): Int {
    println("name = ${name}")
    val x = 0
    return body(x)
}

val result = higherFunc("Sean", { x -> inc( x + 3) })
val result2 =  higherFunc("Sean") { inc(it + 3)}
val result3 = higherFunc("Sean", ::inc)
val result4 = higherFunc("sean") { x -> x + 3}
val result5 = higherFunc("sean") { it + 3 }

fun main() {
    println("result = ${result}")
    println("result = ${result4}")
}
