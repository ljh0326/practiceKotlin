package Class

fun main() {
    var a = Person("박보영", 1990)
    var b = Person("정훈", 1999)

    var c = PersonWithInit("요힛" , 1202)
    var d = PersonWithInit("하잇")
    a.introducde()
}


//함수없이 속성맞 갖는 클래
class Person (var name:String, val birthYear: Int) {
    fun introducde(){
        println("$name 입니다. $birthYear 에 태어났어")
    }
}

//클래스의 속성을 선언함과 동시에 생성자를 선언해
class PersonWithInit(var name:String, var birthYear: Int){
    init{
        println(" ${this.name} : ${this.birthYear}")
    }

    //보조생성자 (속성) : 기본상성자 호출
   constructor(name:String) : this(name,1997){
        println("보조 생성자 사용")
    }
}
