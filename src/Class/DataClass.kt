package `class`

/**
 * DataClass
 * 데이터 다루는데 최적화된 클래스로 다섯가지 기능을 자동적으로 생성해준다.
 * 1. equals() 자동구현
 * 2. hashCode() 자동구현
 * 3. toString() 자동구현
 * 4. copty() 자동구현 똑같은 내용의 객체를 생성할수도있지만 일부속성을 변경할 수도 있다.
 * 5. componentX()의 자동구현(속성을 순서대로 반환해주 것)
 * */

fun main() {
    val a = General("정훈", 123)

    //equals비교
    println(a == General("정훈", 123))
    println(a.hashCode())
    println(a)
    println()

    val b = Data("hun2", 321)
    //equals비교
    println(b == Data("hun2", 321))
    println(b.hashCode())
    println(b)


    println(b.copy())
    println(b.copy("아린"))
    println(b.copy(id = 1212))

    val list = listOf(Data("정훈", 123), Data("hun2", 121), Data("Lee", 122))

    //오졌다
    for ((a, b) in list) {
        println("${a}, ${b}")
    }
}

class General(val name: String, val id: Int)
data class Data(val name: String, val id: Int)

