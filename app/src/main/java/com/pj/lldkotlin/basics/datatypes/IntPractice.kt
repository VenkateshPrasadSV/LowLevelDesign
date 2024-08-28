package com.pj.lldkotlin.basics.datatypes

fun main() {
    testMaxRange()
}

fun testMaxRange() {
   val maxInt: Int =  2147483647
    println(maxInt)
//    val maxInt: Int =  2147483648 (This doesn't work, as it is out of Int Range)
//    Wrong type casting.

    val minInt: Int =  -2147483647

//    val maxInt: Int =  2147483648 (This doesn't work, as it is out of Int Range)

// NOTE:
//    U.S. Numbering System:
//    Two billion, one hundred forty-seven million, four hundred eighty-three thousand, six hundred forty-seven

//    Indian Numbering System:
//    Two hundred fourteen crore, seventy-four lakh, eighty-three thousand, six hundred forty-seven

}