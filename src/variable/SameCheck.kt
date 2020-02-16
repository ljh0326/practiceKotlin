package variable

/**
 * 동일성 체크
 * 1. 내용의 동일성: 메모리상 서로 다른곳에 할당된 객체라도 내용이 같다 동일하다고 판단.
 *   a == b Any.equals()함수가 반환하는 값으로 판단, CustomClass는 equals()를 구현해야 한다.
 * 2. 객체의 동일 : 메모리상 같은 객체를 가르키고 있을때만 동일하다고 판단.
 *   a === b
 * */

fun main() {
    var a = Product("콜라", 1000)
    var b = Product("콜라", 1000)
    var c = a
    var d = Product("사이다", 1000)

    println(a == b)
    println(a === b)

    println(a == c)
    println(a === c)

    println(a == d)
    println(a === d)
}

class Product(val name:String, val price: Int){
    override fun equals(other: Any?): Boolean {
        if(other is Product){
            return other.name == name && other.price == price
        } else {
            return false
        }
    }
}