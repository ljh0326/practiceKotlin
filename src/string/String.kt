package string

fun main() {

    val test1 = "Test.Kotlin.String"

    println(test1.length)

    println(test1.toLowerCase())
    println(test1.toUpperCase())

    val test2 = test1.split(".")
    println(test2)

    //배열에 있는 문자열을 다시 하나로 합쳐줌
    println(test2.joinToString())
    println(test2.joinToString("-"))

    println(test1.substring(5..10))

    //문자열 비었는지 확인

    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"

    //isNullOrEmpty 널이거나 비어있드면 true
    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println()

    //isNullOrBlank 널이거나 블랭크이면 true
    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    println()

    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))

    println(test3.contains("lin"))
    println(test4.contains("lin"))
}