package collection

/**
 * 편리하게 컬렉션을 사용하는 함수
 * list, set map 배열에 함수,람다함수를 사용하여 for문없이 아이템을 순회하며 참조하거나
 * 조건을 건고 구조까지 변경할 수 있다.
 *
 * */

fun main() {
    val nameList = listOf("박수영", "김지수", "김다현", "전유나", "김지우")

    //forEach 순회
    nameList.forEach{ print("$it ")}
    println()

    //filter 조건
    println(nameList.filter { it.startsWith("김") })

    //map 변경한 값을 컬렉션으로 만들어 반환
    println(nameList.map { "이름: $it" })

    //any, all none, 조건에 맞는게 있는지 판별하여 boolean 값 조정
    println(nameList.any { it == "김지연" })
    println(nameList.all { it.length == 3})
    println(nameList.none { it.startsWith("이")})

    //first 조건에 맞는 첫번째 아이템을 반환, last 마지막 아이템 반
    //조건에 맞는 객체가 없는경 NoSuchElementEsxception을 반환
    //firstOrNull or lastOrNull은 널값을 반환
    println(nameList.first { it.startsWith("김") })
    println(nameList.last { it.startsWith("김") })

    //count 중괄호와 함께 사용하 조건에 맞는 아이템 개수 반환
    println(nameList.count{ it.contains("지")})
    println()

    /**
     * ========================================
     */

    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(
        Person("유나", 1992),
        Person("조이", 1996),
        Person("쥬", 1999),
        Person("유나",2003))

    //associateBy
    //객체에서 key를 추출하여 map으로 변환하는 함수
    println(personList.associateBy { it.birthYear })

    //groupBy
    //key가 같은 아이탬끼리 배열로 묶어 map으로 만드는 함수
    println(personList.groupBy { it.name })

    //partition
    //아이템에 조건을 걸어 두개의 컬렉션으로 나누어 줌 반환값은 두 객체를 담는 Pair로 담는다.
    val(over98, under98) = personList.partition { it.birthYear > 1998 }
    println(over98)
    println(under98)

    //flatMap
    //아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수

    //getOrElse
    //인덱스 위치에 아이템이 있으면 아이템을 반환하고 아닌 경우 지정한 기본값을 반환하는 함수

    //zip
    //컬렉션 두개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어준다.

}