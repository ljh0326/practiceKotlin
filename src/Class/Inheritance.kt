package Class

//상속해주기위해 open 사
open class Animal(var name:String, var age:Int, var type:String){
    fun introduce(){
        println("${this.age}, ${this.name}, ${this.type}")
    }
}


//서브 클래스는 수퍼클래스에 존재하는 속성과 같은이름을 같는 속성을 가질 수 없어
//그리고 수퍼클래스의 생성자 무조건 호출해야함
//var, val을 붙이면 속성으로 선언, 없다면 파라미터가
class Dog(name: String, age:Int) : Animal(name, age, "개"){

}

fun main() {
    var a = Animal("쫑이", 5, "개")
    var b = Dog("쫑이", 5)

    a.introduce()
    b.introduce()
}