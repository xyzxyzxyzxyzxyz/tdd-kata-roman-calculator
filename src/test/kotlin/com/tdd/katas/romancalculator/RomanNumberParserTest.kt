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

}