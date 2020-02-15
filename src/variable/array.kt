package variable

fun main() {

    //type casting
    var a: Int = 54321

    //할당 안됨 형변환을 무조건 해줘야 할당이 됨
    //코틀린은 암시적 형변환 지원을 안하고, 명시적 형변환만 지원
    //var b: Long = a

    var b: Long = a.toLong();

    //배열
    var intArr = arrayOf(1, 2, 3, 4, 5)
    var emptyArr = arrayOfNulls<Int>(5)

    //배열사용

    intArr[2] = 8
    println(intArr[2])
}