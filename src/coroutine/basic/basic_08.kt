import kotlinx.coroutines.*
import kotlin.concurrent.thread


// 코루틴이 계속 실행되고있다고해서 프로세스가 유지된느것 아님 프로세스가 끝나면 코루틴도 끝
fun main() = runBlocking { // start main coroutine
    GlobalScope.launch {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(1000L)
        }
    }

    delay(1300L)
}
