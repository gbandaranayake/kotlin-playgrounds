package playground.kotlin

import java.util.*

//no loop in this, just a check to return string
fun fizzBuzz(num: Int) = when {
    num % 15 == 0 -> "FizzBuzz "
    num % 3 == 0 -> "Fizz "
    num % 5 == 0 -> "Buzz "
    else -> " $num"
}

//for loop with integer range, progression
//use until in place of .. for closed range
fun playFizzBuss(start: Int, end: Int) {
    for (i in start..end) println(fizzBuzz(i))
}

//for loop with stepped reversed progression
fun playReverseFizzBuss(start: Int, end: Int) {
    for (i in start downTo end step 2) println(fizzBuzz(i))
}

//for each loop for map iteration
fun printBinaryRepresentationsOfAlphabet() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') binaryReps[c] = Integer.toBinaryString(c.toInt())
    for ((letter, binary) in binaryReps) println("$letter = $binary")
}

//for each loop with index for indexed collections
fun forWithIndex() {
    val list = arrayListOf("10", "11", "1001")
    for((index, item) in list.withIndex()) println("$index = $item")
}

//using in as a check in range
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'