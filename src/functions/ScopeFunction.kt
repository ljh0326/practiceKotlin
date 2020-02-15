package functions

/**
 * 람다함수도 다른 함수처럼 여러 구문을 사용할 수 있다
 * 패러미터가 없는 람다함수는 실행 구문만 적어주면 된다.
 * () -> Unit { println("패러미터가 없당")}
 *
 * 패러미터가 하나라면 it사용
 * (String) -> Unit {println("$it람다함수"}
 */

/**
 * Scpoe함수
 * 함수형 언어의 특징을 좀 더 쉽게 사용할 수 있도록 기본 제공하는 함수
 * apply: 인스턴스를 생성 후 변수에 담기전에 초기화 과정을 수행할 때 사용
 * run
 * whit
 * also
 * let
 */

fun main() {
    //apply
    //기존 경우 인스턴스를 저장한 변수를 통해 참조연산자를 사용해서 속성과 함수를 사용
    //ex a.name, a.discount()
    //apply를 사용하면 apply scope 안에서 인스턴스의 속성과 함수를 참조연산자 없이 사용가능
    //apply는 인스턴스 자신을 반환 즉 apply스코프를 사용하면 main함수와 별도의 scope에서 인스턴스의 변수와 함수를 조작함으로 코드가 깔끔해지는 장점이 있다.
    var a = Book("코틀린 연습", 20000).apply {
        name = "참쉬운 $name"
        disCount()
    }

    //run
    //람다함수처럼 인스턴스대신 마지막 구문의 결과값을 반환한다.
    //이미 인스턴스가 만들어진후에 인스턴스의 함수나 속성을 scope내에서 사용할때 유용하다
    a.run{
        println("상품명: $name, 가격: $price")
    }

    //with
    //run과 동일한 기능
    //인스턴스를 참조연산자 대신 패러미터로 받는것이 차이
    a.run{}
    with(a){}

    //also, let
    //각각 apply와 run과 같은 기능을 갖고있다.
    //다만 apply와 run이 참조연산자 없이 인스턴스의 변수와 메서드를 사용할 수 있었다면
    //also와 let은 마치 패러미터로 인스턴스를 넘긴것처럼 it을 통해서 인스턴스를 사용할 수 있다
    //왜 굳이 패러미터를 통해서 인스턴스를사용하는 귀찮은 과정을 거칠까? 이는 같은이름의 변수나함수가 scope 바깥에 중복되어 있는 경우 혼란을 방지하기 위해서다.
    a.let{
        println("상품명 ${it.name}, 가격: ${it.price} 원")
    }
}

class Book(var name:String, var price: Int){
    fun disCount(){
        price -= 2000;
    }
}

