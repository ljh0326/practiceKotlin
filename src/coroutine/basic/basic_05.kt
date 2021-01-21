import kotlinx.coroutines.*


// Structured concurrency
fun main() = runBlocking { // start main coroutine

    // blocting에 구조를 연결해주면 join 이없어도 끝날떄까지 기다려 줌
    // 즉 top level 코루틴을 만들지말 이 코루틴의 차일드로 코루틴을 만들면 부모가 차일드끝날때까지 기다려줌
    this.launch {
        delay(1000L)
        println("WORLD")
    }

    println("HELLO")
}