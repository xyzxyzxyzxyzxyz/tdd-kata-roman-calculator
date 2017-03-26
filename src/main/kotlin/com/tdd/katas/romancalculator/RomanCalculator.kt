package com.tdd.katas.romancalculator

class RomanCalculator {

    val parser : RomanNumberParser
    val calculator : NumberCalculator
    val formatter : RomanNumberFormatter

    constructor(parser: RomanNumberParser, calculator: NumberCalculator, formatter: RomanNumberFormatter) {
        this.parser = parser
        this.calculator = calculator
        this.formatter = formatter
    }

    fun addRomanNumbers(romanNumber1 : String, romanNumber2 : String) : String {

        val romanNumber1Parsed = parser.parseRomanNumber(romanNumber1)
        val romanNumber2Parsed = parser.parseRomanNumber(romanNumber2)

        val sum = calculator.sumNumbers(romanNumber1Parsed, romanNumber2Parsed)

        return formatter.formatRomanNumber(sum)
    }

}