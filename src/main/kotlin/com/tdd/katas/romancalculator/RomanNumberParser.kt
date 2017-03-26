package com.tdd.katas.romancalculator

class RomanNumberParser {

    fun parseRomanNumber(romanNumber : String) : Int {

        if (isUnitNumber(romanNumber)) {
            return parseUnitNumber(romanNumber)
        }

        if (isDuplicatedLetterNumber(romanNumber)) {
            return parseDuplicatedLetterNumber(romanNumber)
        }

        if (isSingleLetterNumber(romanNumber)) {
            return parseSingleLetterNumber(romanNumber)
        }

        if(isNumberFromElevenToNineteen(romanNumber)){
            return parseNumberFromElevenToNineteen(romanNumber)
        }

        throw IllegalArgumentException("Not a valid number: " + romanNumber)
    }


    private fun isDuplicatedLetterNumber(romanNumber: String) : Boolean {
        return romanNumber.matches(Regex("X{2,3}|C{2,3}|M{2,}"))
    }

    private fun parseDuplicatedLetterNumber(romanNumber: String) : Int {
        // Get the base number value
        var value : Int = parseSingleLetterNumber(romanNumber[0].toString())
        // Multiply it by the length of the string
        return value * romanNumber.length
    }


    private fun  isUnitNumber(romanNumber: String): Boolean {
        return romanNumber.matches(Regex("I|II|III|IV|V|VI|VII|VIII|IX"))
    }

    private fun parseUnitNumber(romanNumber: String) : Int {
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
            else    -> throw IllegalArgumentException("Not a unit number: " + romanNumber)
        }

        return value
    }

    private fun  isSingleLetterNumber(romanNumber: String): Boolean {
        return romanNumber.matches(Regex("X|L|C|D|M"))
    }

    private fun parseSingleLetterNumber(romanNumber: String) : Int {
        var value : Int = -1

        when (romanNumber) {
            "X"     -> value = 10
            "L"     -> value = 50
            "C"     -> value = 100
            "D"     -> value = 500
            "M"     -> value = 1000
            else    -> throw IllegalArgumentException("Not a single letter number: " + romanNumber)
        }

        return value
    }

    private fun isNumberFromElevenToNineteen(romanNumber: String) : Boolean {
        return romanNumber.length > 1
                && romanNumber.startsWith("X")
                && isUnitNumber(romanNumber.substring(1))
    }

    private fun  parseNumberFromElevenToNineteen(romanNumber: String): Int {
        return 10 + parseUnitNumber(romanNumber.substring(1))
    }

}