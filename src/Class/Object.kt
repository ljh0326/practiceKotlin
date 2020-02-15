package `class`

/**
 * 생성자 없이 객체를 직접 만들어내는 object
 * 여러개의 인스턴스를 만들필요가 없고
 * 단 하나의 객체만으로 공통적인 속성과 함수를 사용해야 하는 코드에서는
 * Class를 만들필요 없이 Object를 사용하면 된다.
 *
 * 즉 Singleton Pattern을 언어차원에서 지원하는 것
 */

//인스턴스를 생성하지 않고 이 자체로 객체
//object로 선언된 객체는 최초 사용시 자동으로 생성되며
//이후에는 코드 전체에서 공용으로 사용될 수 있어서 프로그램이 종료되기 전까지 공통적으로 사용할 내용들을
//묶어만드는 것이 좋다
object Counter{

    var count = 0

    fun countUp(){
        count++
    }

    fun clear(){
        count = 0
    }
}

//기존클래스에서도 오브젝트를 만들 수 있다.
//Companion Object
//클래스 인스턴스 기능을 그대로사용하면서 인스턴스간 그대로 사용할 속성과 함수들을 별도로 만드는 기능
//기존 Static 멤버와 비슷하다고 생각하면 된다.
class FoodPoll (val name: String){
    companion object{
        var total = 0
    }

    var count = 0

    fun vote(){
        total++
        count++
    }
}

fun main() {
    //Object 예제
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    //companion object 예제
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()
    b.vote()
    b.vote()
    b.vote()

    println("${a.name}, ${a.count}");
    println("${b.name}, ${b.count}");
    println("총계: ${FoodPoll.total}");
}