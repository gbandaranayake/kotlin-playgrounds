package playground.kotlin

fun String.lastChar(): Char = this[this.length - 1]

fun Int.lastChar(): Char = "$this".lastChar()

