package com.tdd.katas.romancalculator

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before


class RomanNumberFormatterTest {

    var numberFormatter:RomanNumberFormatter = RomanNumberFormatter()

    @Before
    fun setup(){
        numberFormatter = RomanNumberFormatter()
    }

    @Test
    fun singleUnitsAreFormattedProperly(){
        assertFormattedRomanNumberEquals("I"    , 1)
        assertFormattedRomanNumberEquals("II"   , 2)
        assertFormattedRomanNumberEquals("III"  , 3)
        assertFormattedRomanNumberEquals("IV"   , 4)
        assertFormattedRomanNumberEquals("V"    , 5)
        assertFormattedRomanNumberEquals("VI"   , 6)
        assertFormattedRomanNumberEquals("VII"  , 7)
        assertFormattedRomanNumberEquals("VIII" , 8)
        assertFormattedRomanNumberEquals("IX"   , 9)
    }

    @Test
    fun tenthsNumbersAreFormattedProperly() {
        assertFormattedRomanNumberEquals("X"    , 10)
        assertFormattedRomanNumberEquals("XX"   , 20)
        assertFormattedRomanNumberEquals("XXX"  , 30)
        assertFormattedRomanNumberEquals("XL"   , 40)
        assertFormattedRomanNumberEquals("L"    , 50)
        assertFormattedRomanNumberEquals("LX"   , 60)
        assertFormattedRomanNumberEquals("LXX"  , 70)
        assertFormattedRomanNumberEquals("LXXX" , 80)
        assertFormattedRomanNumberEquals("XC"   , 90)

    }

    @Test
    fun hundredNumbersAreFormattedProperly() {
        assertFormattedRomanNumberEquals("C"    , 100)
        assertFormattedRomanNumberEquals("CC"   , 200)
        assertFormattedRomanNumberEquals("CCC"  , 300)
        assertFormattedRomanNumberEquals("CD"   , 400)
        assertFormattedRomanNumberEquals("D"    , 500)
        assertFormattedRomanNumberEquals("DC"   , 600)
        assertFormattedRomanNumberEquals("DCC"  , 700)
        assertFormattedRomanNumberEquals("DCCC" , 800)
        assertFormattedRomanNumberEquals("CM"   , 900)
    }

    @Test
    fun thousandsNumbersAreFormattedProperly() {
        assertFormattedRomanNumberEquals("M"                , 1000)
        assertFormattedRomanNumberEquals("MM"               , 2000)
        assertFormattedRomanNumberEquals("MMM"              , 3000)
        assertFormattedRomanNumberEquals("MMMM"             , 4000)
        assertFormattedRomanNumberEquals("MMMMM"            , 5000)
        assertFormattedRomanNumberEquals("MMMMMM"           , 6000)
        assertFormattedRomanNumberEquals("MMMMMMM"          , 7000)
        assertFormattedRomanNumberEquals("MMMMMMMM"         , 8000)
        assertFormattedRomanNumberEquals("MMMMMMMMM"        , 9000)
    }


    private fun assertFormattedRomanNumberEquals(expectedFormat : String, number : Int){
        assertEquals(expectedFormat, numberFormatter.formatRomanNumber(number))
    }
}