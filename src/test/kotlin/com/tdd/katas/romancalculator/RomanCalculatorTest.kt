package com.tdd.katas.romancalculator

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RomanCalculatorTest {

    var calculator: RomanCalculator? = null

    @Before
    fun setUp() {
        calculator = RomanCalculator()
    }


    @Test
    fun test() {
        // 1 + 1 = 2
        assertSummedRomanNumbersAfterFormattingEquals("I", "I", "II")
        // 10 + 8 = 18
        assertSummedRomanNumbersAfterFormattingEquals("X", "VIII", "XVIII")
        // 100 + 5 = 105
        assertSummedRomanNumbersAfterFormattingEquals("C", "V", "CV")
        // 5 + 1012 = 1017
        assertSummedRomanNumbersAfterFormattingEquals("V", "MXII", "MXVII")
        // 3578 + 7999 = 11577
        assertSummedRomanNumbersAfterFormattingEquals("MMMDLXXVIII", "MMMMMMMMCMXCIX", "MMMMMMMMMMMDLXXVII")
    }


    fun assertSummedRomanNumbersAfterFormattingEquals(
            romanNumber1: String,
            romanNumber2: String,
            expectedFormattedResult: String) {

        assertEquals(expectedFormattedResult, calculator!!.addRomanNumbers(romanNumber1, romanNumber2))
    }

}