package pattern

/**
 * 이벤트가 일어나는것을 감시하는 역할을 만든다고하여 observer라고함
 * ex 키가 입력된다던지, 터치가 발생된다던지, 데이터가 들어온다던지
 * 함수를 직접 호출하는게 아니라, 시스템 혹은 루틴에의해서 발생하게 되는 동작들을 이벤트라고 하며 이 이벤트가 발생할때마다
 * 즉각적으로 처리할 수 있도록 만든느 프로그래밍 패턴을 옵저버 패턴이라고함
 *
 * 보통 두가지 클래스가필요
 * 1. 이벤트를 수신 A EventPrinter
 * 2. 이벤트의 발생 및 전달 B Counter
 *
 * 어떻게 할 수 있을까? B가 이벤트를 발생하면 A에 있는 이벤트 처리 함수를 호출하면됨
 */

interface EventListener{
    fun onEvent(count: Int)
}

//B
class Counter(var listener: EventListener){
    fun count(){
        for(i in 1..100){5
            if(i % 5 == 0){
                listener.onEvent(i)
            }
        }
    }
}

//A
class EventPrinter: EventListener{
    override fun onEvent(count: Int) {
        println("${count}-")
    }

    fun start(){
        val counter = Counter(this)
        counter.count()
    }
}

//A.익명객체
class EventPrinter2{
    fun start(){
        val counter = Counter(object: EventListener{
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}

fun main() {
    //() 객체생성 연산자
    EventPrinter().start()
    EventPrinter2().start()
}
