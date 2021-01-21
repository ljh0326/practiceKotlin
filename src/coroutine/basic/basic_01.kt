import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() {

    // luanch에서 코루틴이 만들어지고 Ssope안에서 딜레이와 프린트 실행 런치는 스코프가 있기에 실행할 수 있음
    // GlobalScpe는 CoroutineScpe인데 라이프타임이 프로그램 전체임
//    GlobalScope.launch { // launch a new coroutine in background and continue
//        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
//        println("World!") // print after delay
//    }

    // 쓰레드로 변경해도 실행결과는 비슷하게 보임
   thread {
        Thread.sleep(1000L)
        println("World")
    }

    println("Hello,") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}