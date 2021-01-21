import kotlinx.coroutines.*

// 전체 구문이 다 실행되기 전까지는 메인쓰레드가 종료되지 않음
fun main() = runBlocking { // start main coroutine

    // 이코루틴은 3초뒤에 호출하고싶은데 2초만 기다린다면 프로그램이 종료됨
   val job = GlobalScope.launch { // launch a new coroutine in background and continue
        delay(3000L)
        println("World!")
    }
    println("Hello,") // main coroutine continues here immediately
    // job이 완료될때까지 대기하고 종료해라
    job.join()
}