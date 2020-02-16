package collection

/**
 * 중복이 허용되지 않는 컬렉션
 * Set<>
 * MutableSet<>
 * */

fun main() {

    val a = mutableSetOf<String>("귤", "사과", "키위")

    for (s in a) {
        println(s)
    }

    a.add("자몽")
    println(a)

    a.remove("키위")
    a.contains("귤")

    a.add("자몽")
    println(a)
}