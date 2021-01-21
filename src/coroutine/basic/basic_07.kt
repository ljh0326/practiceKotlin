import kotlinx.coroutines.*
import kotlin.concurrent.thread


fun main() = runBlocking { // start main coroutine

    repeat(100000) {
        // thread 랑비교했을때 훨씬빠름...
        launch {
            delay(1000L)
            print(".")
        }
    }

    repeat(100000) {
         thread {
             Thread.sleep(1000L)
            print(".")
        }
    }
}
