package conditionFlow

import java.util.*
import java.util.Collections.list

fun main() {

    var a = 0;

    //조건형 반복문
    while(a < 5){
        print(a++)
    }

    //범위형 반복문
    for(i in 0..9){
        print(i)
    }

    //여러값씩 늘어날 때
    for(i in 0..9 step 3){
        print(i)
    }

    for(i in 9 downTo 0){
        print(i)
    }

    for(i in 'a'..'e'){
        print(i)
    }

    //loop escape
    for(i in 1..10){
        for(j in 1..10){
            if(i == 1 && j == 2) break
        }
    }

    //내부에서 종료되면 label 달린 반복문까지 자동으로 종료되도록 해줌
   loop@for(i in 1..10){
        for(j in 1..10){
            if(i == 1 && j == 2) break@loop
        }
    }

    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps){
        println("$letter = $binary")
    }

}


