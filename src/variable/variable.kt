package variable

/**
 * 코틀린은 기본변수에서 널을 허용하지 않으며 초기값도 따로 할당되지 않으면 문법에러 표시해
 */
fun main() {
    var a: Int = 0
    println(a)

    //nullable 자료형 뒤에 ? 붙이면 된다.
    var b: Int?

    //기본자료형 자바와 거의 동일
    //정수형
    var intValue: Int = 1234
    var longValue:Long = 1234L
    var intValueByHex:Int = 0x1af
    var intValueByBin:Int = 0b1010101

    //실수형
    var doubleValue: Double = 123.5
    var doubleValueWithExp: Double = 123.5e10
    var floatValue: Float = 123.5f

    //문자열 UTF-16BE
    var charValue:Char = 'a'
    var koreanCharValue:Char = '가'

    //Boolean
    var booleanValue:Boolean = true

    //문자열
    val stringValue = "one line string test"
    val multilineStringValue = """
        multiline
        string
        test
    """


}