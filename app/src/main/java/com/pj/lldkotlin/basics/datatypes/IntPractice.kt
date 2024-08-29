package com.pj.lldkotlin.basics.datatypes

import android.os.Build.VERSION_CODES.Q

fun main() {
    testMaxRange()


    // Extra observations:
//    Q : Is numbers of bit are directly associated with number transistors?
//    The answer no, to create 32 bit of memory in RAM, we might need more transistors.
//    We can't assume that numbers of transistors are directly associated with number of bits.

//    While 32 bits are used to represent a 32-bit integer,
//    the number of transistors required to store and process those bits is much higher,
//    depending on the specific technology (like SRAM, DRAM, or processor registers)
//    and the complexity of the operations performed on those bits.
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