package variable

/**
 * 타입추론
 * 코틀린이 자동으로 자료형을 추론해줌
 */
fun main() {

    //이전 예제에서도 자료형 할당 안했었어 근데 그냥 왼만하면 선언해주자
    //자료형없이 값을 할당한다면 어떤 자료형으로 지정될까요?

    var a = 1234
    var b = 1234L

    var c = 12.34
    var d = 12.45f

    var e = 0xABCD
    var f = 0b10101010

    var g = true
    var h = 'c'
    var i = "test"

    //function
    println(add(5, 6, 7))
}

//fun 함수이름(파람): 반환형
fun add(a: Int, b: Int, c: Int): Int{
    return a + b + c
}

//단일표현식함수 변수에 값을 할당하듯 식을 할당 반환형도 추론해준다.
fun add(a: Int, b: Int) = a + b


