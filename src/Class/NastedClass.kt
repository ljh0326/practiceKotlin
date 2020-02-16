package `class`

/**
 * 중첩클래스
 * 하나의 클래스가 다른 클래스의 기능과 강하게 연결되어있단 의미를 전다하기위해 만들어진 형식
 * 외부클래스이름.중첩클래스이름으로 사용
 * 형태만 내부에 존재할 실질적으로 서로 내용을 직접 공유할수는 없
 *
 * 내부클래스
 * 혼자서 객체를 만들수는 없고 외부클래스의 객체가 있어야 생성과 사용이 가능한 클래스
 * 외부클래스객체의 속성과 함수를 사용할 수 있다.
 *
 * 중첩클래스와 내부클래스 모두 클래스간의 연계성을 표현하여 코드의 가독성및 작성 편의성을 올리기위해 사용한다.
 * */

fun main() {
    Outer.Nasted().introduce()

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}

class Outer{
    var text = "Outer Class"

    class Nasted{
        fun introduce(){
            println("Nasted Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner(){
            println(text)
        }

        fun introduceOuter(){
            //outer와 inner에 같은 이름의 속성이 있다면 이렇게 참고
            println(this@Outer.text)
        }
    }
}