package collection

/**
 * List:        생성시 넣은 객체를 대체, 추가, 삭제 불가
 * MutableList: 생성시 넣은 객체를 대체, 추가, 삭제 가
 * */

fun main() {

    val a = listOf("사과", "딸기", "배")

    for(fruit in a){
        print(fruit)
    }

    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)
}