package com.tdd.katas.romancalculator

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class RomanNumberParserTest {

    var parser : RomanNumberParser? = null

    @Before
    fun setUp() {
        parser = RomanNumberParser()
    }

    @Test
    fun emptyStringIsConvertedToZero() {
        assertParsedRomanNumberEquals(0, "")
    }


        @Test
    fun unitsAreConvertedProperly(){
        assertParsedRomanNumberEquals(1, "I")
        assertParsedRomanNumberEquals(2, "II")
        assertParsedRomanNumberEquals(3, "III")
        assertParsedRomanNumberEquals(4, "IV")
        assertParsedRomanNumberEquals(5, "V")
        assertParsedRomanNumberEquals(6, "VI")
        assertParsedRomanNumberEquals(7, "VII")
        assertParsedRomanNumberEquals(8, "VIII")
        assertParsedRomanNumberEquals(9, "IX")
    }

    @Test
    fun singleLetterNumbersAreProperlyConverted() {
        assertParsedRomanNumberEquals(10, "X")
        assertParsedRomanNumberEquals(50, "L")
        assertParsedRomanNumberEquals(100, "C")
        assertParsedRomanNumberEquals(500, "D")
        assertParsedRomanNumberEquals(1000, "M")
    }

    @Test
    fun twoDuplicatedLetterNumbersAreProperlyConverted() {
        assertParsedRomanNumberEquals(20, "XX")
        assertParsedRomanNumberEquals(30, "XXX")

        assertParsedRomanNumberEquals(200, "CC")
        assertParsedRomanNumberEquals(300, "CCC")

        assertParsedRomanNumberEquals(2000, "MM")
        assertParsedRomanNumberEquals(5000, "MMMMM")
    }

    @Test
    fun numbersFromElevenToNineteenThatRequireAdditionAreProperlyConverted() {
        assertParsedRomanNumberEquals(11, "XI")
        assertParsedRomanNumberEquals(12, "XII")
        assertParsedRomanNumberEquals(13, "XIII")
        assertParsedRomanNumberEquals(14, "XIV")
        assertParsedRomanNumberEquals(15, "XV")
        assertParsedRomanNumberEquals(16, "XVI")
        assertParsedRomanNumberEquals(17, "XVII")
        assertParsedRomanNumberEquals(18, "XVIII")
        assertParsedRomanNumberEquals(19, "xix")
    }

    @Test
    fun numbersFromTwentyOneToTwentyNineThatRequireAdditionAreProperlyConverted() {
        assertParsedRomanNumberEquals(21, "XXI")
        assertParsedRomanNumberEquals(22, "XXII")
        assertParsedRomanNumberEquals(23, "XXIII")
        assertParsedRomanNumberEquals(24, "XXIV")
        assertParsedRomanNumberEquals(25, "XXV")
        assertParsedRomanNumberEquals(26, "XXVI")
        assertParsedRomanNumberEquals(27, "XXVII")
        assertParsedRomanNumberEquals(28, "XXVIII")
        assertParsedRomanNumberEquals(29, "Xxix")
    }

    fun assertParsedRomanNumberEquals(expectedNumber: Int, romanNumber: String) {
        assertEquals(expectedNumber, parser!!.parseRomanNumber(romanNumber))
    }

}