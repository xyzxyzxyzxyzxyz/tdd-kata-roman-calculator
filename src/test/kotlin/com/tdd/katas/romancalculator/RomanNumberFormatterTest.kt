package com.tdd.katas.romancalculator

import org.junit.Test
import org.junit.Assert.*


class RomanNumberFormatterTest {

    @Test
    fun singleUnitsAreFormattedProperly(){
        var numberFormatter = RomanNumberFormatter()

        assertEquals("I"    , numberFormatter.formatRomanNumber(1))
        assertEquals("II"   , numberFormatter.formatRomanNumber(2))
        assertEquals("III"  , numberFormatter.formatRomanNumber(3))
        assertEquals("IV"   , numberFormatter.formatRomanNumber(4))
        assertEquals("V"    , numberFormatter.formatRomanNumber(5))
        assertEquals("VI"   , numberFormatter.formatRomanNumber(6))
        assertEquals("VII"  , numberFormatter.formatRomanNumber(7))
        assertEquals("VIII" , numberFormatter.formatRomanNumber(8))
        assertEquals("IX"   , numberFormatter.formatRomanNumber(9))

    }

    @Test
    fun tenthsNumbersAreFormatedProperly() {
        var numberFormatter = RomanNumberFormatter()

        assertEquals("X"    , numberFormatter.formatRomanNumber(10))
        assertEquals("XX"   , numberFormatter.formatRomanNumber(20))
        assertEquals("XXX"  , numberFormatter.formatRomanNumber(30))
        assertEquals("XL"   , numberFormatter.formatRomanNumber(40))
        assertEquals("L"    , numberFormatter.formatRomanNumber(50))
        assertEquals("LX"   , numberFormatter.formatRomanNumber(60))
        assertEquals("LXX"  , numberFormatter.formatRomanNumber(70))
        assertEquals("LXXX" , numberFormatter.formatRomanNumber(80))
        assertEquals("XC"   , numberFormatter.formatRomanNumber(90))

    }

}