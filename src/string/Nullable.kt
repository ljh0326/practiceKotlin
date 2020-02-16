package string

/**
 * nullAble 함수를 쓰면 항상 널인지 체크해 줘야한다.
 * ?. null safe operator            : 참조연산자를 실행하기전 객체가 널인지 확인하고 null이면 뒤에오 구문을 실행하지 않는다.
 * ?: elvis operator                : 객체가 null이 아니라면 그대로 사용하지만 null이라면 연산자 우측에 있는 객체로 대체되는 연산
 * !!. non-null assertion operator  : 참조연산자를 사용할때 null 여부를 컴파일시 확인하지 않도록하여 런타임시 에러가나도록 의도적으로 방치하는 연산자
 */

fun main() {
    var a: String? = null

    println(a?.toUpperCase())

    println(a?:"default".toUpperCase())

    println(a!!.toUpperCase())

    /**
     * 널 세이프틑 스코프와 사용하면 더 편리하다
     * if(a == null) 보다 a? 가 훨씬 편
     */
    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    }

}


