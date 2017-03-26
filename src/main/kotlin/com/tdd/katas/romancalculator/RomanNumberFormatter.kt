package com.tdd.katas.romancalculator

class RomanNumberFormatter {

    fun formatRomanNumber(number: Int) : String =

        when(number){
            0 -> ""
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            7 -> "VII"
            8 -> "VIII"
            9 -> "IX"
            else -> throw IllegalArgumentException("Not a unit: " + number)
        }
}