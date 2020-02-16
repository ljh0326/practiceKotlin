package collection

/**
 * key value를 쌍으로 데이터 보관
 * 객체의 위치가아닌 고유한 키로 객체를 참조해
 * 같은키넣으면 기존 객체 대체됨
 *
 * Map<K, V>, MutableMap<K, V>
 * */

fun main() {

    val a = mutableMapOf<String, String>("레드벨벳" to "음파음파",
        "트와이스" to "FANCY", "ITZY" to "ICY")

    for (mutableEntry in a) {
        println("${mutableEntry.key}, ${mutableEntry.value}")
    }

    a.put("오마이걸", "번지")
    println(a)

    a.remove("ITZY")
    println(a)

    println(a["레드벨벳"])
    
}