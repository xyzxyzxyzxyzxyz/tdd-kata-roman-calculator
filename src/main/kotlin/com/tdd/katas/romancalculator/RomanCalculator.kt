package com.tdd.katas.romancalculator

class RomanCalculator {

    fun addRomanNumbers(romanNumber1 : String, romanNumber2 : String) : String {
        var parser = RomanNumberParser()
        var calculator = NumberCalculator()
        var formatter = RomanNumberFormatter()

        val romanNumber1Parsed = parser.parseRomanNumber(romanNumber1)
        val romanNumber2Parsed = parser.parseRomanNumber(romanNumber2)

        val sum = calculator.sumNumbers(romanNumber1Parsed, romanNumber2Parsed)

        return formatter.formatRomanNumber(sum)
    }

}