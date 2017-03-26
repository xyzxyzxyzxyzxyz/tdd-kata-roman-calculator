package com.tdd.katas.romancalculator

class RomanNumberParser {

    fun parseRomanNumber(romanNumber : String) : Int {
        var value : Int

        when (romanNumber) {
            "I"     -> value = 1
            "II"    -> value = 2
            "III"   -> value = 3
            "IV"    -> value = 4
            "V"     -> value = 5
            "VI"    -> value = 6
            "VII"   -> value = 7
            "VIII"  -> value = 8
            "IX"    -> value = 9
            else    -> throw IllegalArgumentException("Not a valid unit number")
        }

        return value
    }

}