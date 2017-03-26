package com.tdd.katas.romancalculator

class RomanNumberParser {

    fun parseRomanNumber(romanNumber : String) : Int {
        var romanNumber = romanNumber.toUpperCase()
        return parseNumber(romanNumber)
    }

    private fun  parseNumber(romanNumber: String): Int {
        var sum = 0

        var currentIndex : Int = romanNumber.length - 1     // Start at the end
        var currentLetter : Char = ' '
        var previousLetter : Char?
        var data : Array<Int?> = arrayOfNulls(2)

        while (currentIndex >= 0) {
            currentLetter = romanNumber[currentIndex]

            when (currentIndex) {
                0       -> previousLetter = null
                else    -> previousLetter = romanNumber[currentIndex-1]
            }

            calculateLetterValue(currentLetter, previousLetter, data)

            sum += data[0]!!
            currentIndex -= data[1]!!
        }

        return sum
    }

    private fun  calculateLetterValue(currentLetter: Char, previousLetter: Char?, data: Array<Int?>) {
        var value : Int = -1
        var step : Int = 1

        when {
            (currentLetter=='I')                            -> value = 1

            (previousLetter=='I' && currentLetter=='V')     -> { value = 4; step = 2 }
            (currentLetter=='V')                            -> value = 5

            (previousLetter=='I' && currentLetter=='X')     -> { value = 9; step = 2 }
            (currentLetter=='X')                            -> value = 10

            (previousLetter=='X' && currentLetter=='L')     -> { value = 40; step = 2 }
            (currentLetter=='L')                            -> value = 50

            (previousLetter=='X' && currentLetter=='C')     -> { value = 90; step = 2 }
            (currentLetter=='C')                            -> value = 100

            (previousLetter=='C' && currentLetter=='D')     -> { value = 400; step = 2 }
            (currentLetter=='D')                            -> value = 500

            (previousLetter=='C' && currentLetter=='M')     -> { value = 900; step = 2 }
            (currentLetter=='M')                            -> value = 1000

        }

        data[0] = value
        data[1] = step
    }


}