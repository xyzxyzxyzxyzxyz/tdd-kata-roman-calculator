package com.tdd.katas.romancalculator

class RomanNumberParser {

    fun parseRomanNumber(romanNumber : String) : Int {
        var value : Int = -1

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
        }

        if (value != -1) {
            return value
        }

        when (romanNumber) {
            "X"     -> value = 10
            "L"     -> value = 50
            "C"     -> value = 100
            "D"     -> value = 500
            "M"     -> value = 1000
        }

        if (value != -1) {
            return value
        }

        throw IllegalArgumentException("Not a valid unit number: " + romanNumber)
    }



}