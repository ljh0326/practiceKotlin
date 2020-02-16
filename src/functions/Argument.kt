package functions

/**
 * 패러미터를 받아야하는 함수이지만
 * 별다른 패러미터가 없어도 기본값으로 동작해야 한다면? 어떻게함?
 * defaultArgument를 사용한다!!
 *
 * namedAurgument : 패러미터의 순서와 관계없이 패러미터 이름을사용하여
 * 직접 패러미터 값을 할당하는 방법
 *
 * 같은 자료형을 개수에 상관없이 패러미터로 받고싶을때사용하는 variable number of arguments(vararg)
 *
 * infix: 함수를 연산자처럼 사용할 수 있
 * */


fun main() {
    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("짬뽕", 30, "학교")

    //만약 숫자만 default값을 사용하고 싶다면? named argument를 사용한다
    deliveryItem("선물", destination = "친구집")

    sum(1, 2, 3, 4)

    println(6 multiply 4)
    println(6.multiply(4))
}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집"){
    println("${name}, ${count}개를 ${destination}에 배달했습니다.")
}

//같은 타입의 매개변수 여러개를 받는 것
fun sum(vararg numbers: Int){
    var sum = 0

    for (number in numbers) {
        sum += number
    }

    println(sum)
}

//클래스 안에서 사용한다면 적용할 infix는 클래스 자기 자
infix fun Int.multiply(x: Int): Int = this * x