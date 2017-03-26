package com.tdd.katas.romancalculator

import org.junit.Test
import org.junit.Assert.*

class RomanNumberParserTest {

    @Test
    fun unitsAreConvertedProperly(){

        val parser = RomanNumberParser()

        assertEquals(1, parser.parseRomanNumber("I"))
        assertEquals(2, parser.parseRomanNumber("II"))
        assertEquals(3, parser.parseRomanNumber("III"))
        assertEquals(4, parser.parseRomanNumber("IV"))
        assertEquals(5, parser.parseRomanNumber("V"))
        assertEquals(6, parser.parseRomanNumber("VI"))
        assertEquals(7, parser.parseRomanNumber("VII"))
        assertEquals(8, parser.parseRomanNumber("VIII"))
        assertEquals(9, parser.parseRomanNumber("IX"))
    }

    @Test
    fun singleLetterNumbersAreProperlyConverted() {
        val parser = RomanNumberParser()

        assertEquals(10, parser.parseRomanNumber("X"))
        assertEquals(50, parser.parseRomanNumber("L"))
        assertEquals(100, parser.parseRomanNumber("C"))
        assertEquals(500, parser.parseRomanNumber("D"))
        assertEquals(1000, parser.parseRomanNumber("M"))
    }

    @Test
    fun twoDuplicatedLetterNumbersAreProperlyConverted() {
        val parser = RomanNumberParser()

        assertEquals(20, parser.parseRomanNumber("XX"))
        assertEquals(30, parser.parseRomanNumber("XXX"))

        assertEquals(200, parser.parseRomanNumber("CC"))
        assertEquals(300, parser.parseRomanNumber("CCC"))

        assertEquals(2000, parser.parseRomanNumber("MM"))
        assertEquals(5000, parser.parseRomanNumber("MMMMM"))

    }

    @Test
    fun numbersFromElevenToNineteenThatRequireAdditionAreProperlyConverted() {
        val parser = RomanNumberParser()

        assertEquals(11, parser.parseRomanNumber("XI"))
        assertEquals(12, parser.parseRomanNumber("XII"))
        assertEquals(13, parser.parseRomanNumber("XIII"))
        assertEquals(14, parser.parseRomanNumber("XIV"))
        assertEquals(15, parser.parseRomanNumber("XV"))
        assertEquals(16, parser.parseRomanNumber("XVI"))
        assertEquals(17, parser.parseRomanNumber("XVII"))
        assertEquals(18, parser.parseRomanNumber("XVIII"))
        assertEquals(19, parser.parseRomanNumber("xix"))
    }

    @Test
    fun numbersFromTwentyOneToTwentyNineThatRequireAdditionAreProperlyConverted() {
        val parser = RomanNumberParser()

        assertEquals(21, parser.parseRomanNumber("XXI"))
        assertEquals(22, parser.parseRomanNumber("XXII"))
        assertEquals(23, parser.parseRomanNumber("XXIII"))
        assertEquals(24, parser.parseRomanNumber("XXIV"))
        assertEquals(25, parser.parseRomanNumber("XXV"))
        assertEquals(26, parser.parseRomanNumber("XXVI"))
        assertEquals(27, parser.parseRomanNumber("XXVII"))
        assertEquals(28, parser.parseRomanNumber("XXVIII"))
        assertEquals(29, parser.parseRomanNumber("Xxix"))
    }


}