package com.tdd.katas.romancalculator

import org.junit.Test
import org.junit.Assert.*

class NumberCalculatorTest {

    @Test
    fun givenOneAndOneMustSumTwo() {
        val number1 = 1
        val number2 = 1

        val calc : NumberCalculator = NumberCalculator()

        val result = calc.sumNumbers(number1, number2)

        assertEquals("Should be two", 2, result)
    }

}