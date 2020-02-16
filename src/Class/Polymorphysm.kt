package `class`

/**
 * as: 변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자
 * is: 변수가 자료형에 호환되는지를 체크한후 변환해주는 캐스팅 연산로 조건문내에서 사용된다.
 * */


open class Dring{
    var name:String = "음료"

    open fun drink(){
        println("${name}을 마십니다.")
    }
}

class Cola: Dring(){
    var type = "콜라"

    override fun drink() {
        println("${name}중 ${type}을 마십니다.")
    }

    fun washDishes(){
        println("${type}로 설거지를 합니다.")
    }
}

fun main() {
    var a = Dring()
    a.drink()

    var b: Dring = Cola()
    b.drink()

    //b는 Cola만 갖고있는 메서드나 속성을 사용할수 없기 때문에 is나 as를 통해 다운캐스팅 해줘야한다.
    if(b is Cola){
        //b는 조건문 안에서만 잠시 다운캐스팅 된다.
        b.washDishes()
    }

    //다운캐스팅해서 c에 삽입 b자체도 다운캐스팅 해준다.
    var c = b as Cola
    c.washDishes()
    b.washDishes()
}