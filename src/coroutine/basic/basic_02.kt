import kotlinx.coroutines.*

fun main() {

    // 런키는 자신을 호출한 쓰레드를 블로킹하지 않음
    GlobalScope.launch { // launch a new coroutine in background and continue
        delay(1000L)
        println("World!")
    }
    println("Hello,") // main thread continues here immediately

    // 블록킹할수있는 코루틴
    runBlocking {     // but this expression blocks the main thread

        //쓰레드가 블록킹 되는 함수
//        Thread.sleep(1000L)
        // delay는 suspend 함수 그냥 딜레이는안됨 suspend는 코루팅 펑션이나 다른 서스펜드 펑션에서 실행가
        delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
    }
}