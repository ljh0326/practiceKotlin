import kotlinx.coroutines.*
import kotlin.concurrent.thread

// 일시 중단과 재개 Global coroutines are like daemon threads
fun main() = runBlocking { // start main coroutine

    // 코루틴을 위한 스케줄링이 된다?
    launch {
        repeat(5) { i ->
            println("Coroutine A, $i")
            delay(10L)
        }
    }

    launch {
        repeat(5) { i ->
            println("Coroutine B, $i")
            delay(10L)
        }
    }

    println("Coroutine Outer")
}

fun <T>println(msg: T) {
    kotlin.io.println("$msg [${Thread.currentThread().name}]")
}
