package functions
/**
    고차함수
    함수를 마치 클래스에서 만들어낸 인스턴스처럼 취급하는방법
    함수를 패러미터로 넘길수도 결과값으로 반환받을수도 있다.
    코틀린은 모든함수가 고차함수로 만들 수 있다.
 */

fun main() {
    //:: 일반함수를 고차함수로 변경해주는 연산자
    b(::a)

    //패러미터로 넘길함수를 굳이 이름까지 붙여줄 이유가 있을까? 람도로 바꿔보자
    val c: (String) -> Unit = {str -> println("$str")}
    b(c)

    //타입추론을 이용하여 좀더 축약
}


//A의 함수형 형식을 받을수 있는 매개값 설정
fun b (function: (String) -> Unit){
    //받은 함수를 호출
    function("b가 호출함")
}

fun a(str: String){
    println("$str")
}

