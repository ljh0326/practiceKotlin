package funtionalPrograming

import java.io.File

//============================
// 클로저
// 내부에서 외부 범위에 있는 점근할 수 있는 개
//============================

class Calc {
    fun addTest(a: Int) {
        a + 1
    }

    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) {
        add(a, b)
    }
}

fun main() {
    val calc = Calc()
    var result = 4
    // 원래대로라면 result는 저기 안에서 끝나는거야 결과값이 이 result에 영향을 미치지 못함
    calc.addTest(result)
    println("result = ${result}")
    // 람다식과 같이써주면, 클로저로인해 외부 변수에 접근이 가능함
    calc.addNum(5, 8) { x, y -> result += x * y }
    println("result = ${result}")


    val person2 = Person("test", "test")

    val result2 = with (person2){

    }
}

//============================
// let: 함수적용한 결과값 반환
//============================

fun checkScore(score: Int? = 32) {
    if (score != null)
        println("score = ${score}")
}

fun checkScoreLet(score: Int? = 32) {
    score?.let { println("it = ${it}") }
    val str = score?.let { it.toString() }
    println("str = ${str}")
}

//============================
// also bolck한값을 반환하는게아니라 받은 결과 자체 반환
//============================
data class Person(val name: String, val skills: String) {
    var person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills
        "success"
    }

    val b = person.also {
        it.skills
        "success"
    }
}

fun makeDir(path: String): File {
    val result = File(path)
    result.mkdir()
    return result
}

fun mkDir(path: String) = File(path).also { it.mkdir() }

//============================
// apply
//============================

val person = Person("test", "test").apply {  }

fun mkDirWithApply(path: String)  = File(path).apply { mkdir() }

//============================
// with
//============================





