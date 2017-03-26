package com.tdd.katas.romancalculator

class RomanCalculatorFactory {

    companion object RomanCalculatorFactory {
        fun getCalculator(): RomanCalculator {
            return RomanCalculator(
                    RomanNumberParser(),
                    NumberCalculator(),
                    RomanNumberFormatter()
            )
        }
    }

}