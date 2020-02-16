package `class`

/**
 * 클래스나 함수에서 사옹하는 자료형을 외부에서 지정해주느 기능을 Generic이라고 한다.
 * */

open class A {
    open fun shout(){
        println("A가 소리침")
    }
}

class B: A(){
    override fun shout() {
        println("B가 소리친다.")
    }
}

class C: A(){
    override fun shout() {
        println("C가 소리친다.")
    }
}

class UsingGeneric<T:A> (val t: T){
    fun doShout(){
        t.shout()
    }
}

fun <T: A> doShouting(t: T): String{
    t.shout()
    return "왕"
}

fun main(){
    UsingGeneric(A()).doShout()
    UsingGeneric(B()).doShout()
    UsingGeneric(C()).doShout()

    println(doShouting(A()))
}