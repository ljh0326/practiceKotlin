import kotlinx.coroutines.*

// 전체 구문이 다 실행되기 전까지는 메인쓰레드가 종료되지 않음
fun main() = runBlocking { // start main coroutine
    GlobalScope.launch { // launch a new coroutine in background and continue
        delay(1000L)
        println("World!")
    }
    println("Hello,") // main coroutine continues here immediately
    delay(2000L)      // delaying for 2 seconds to keep JVM alive
}