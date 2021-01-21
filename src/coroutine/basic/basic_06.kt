import kotlinx.coroutines.*


fun main() = runBlocking { // start main coroutine

    this.launch {
        myWorld()
    }
    println("HELLO")
}

suspend fun myWorld() {
    delay(1000L)
    println("WORLD")
}