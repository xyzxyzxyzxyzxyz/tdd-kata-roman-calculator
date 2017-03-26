package com.tdd.katas.romancalculator

class RomanNumberFormatter {

    fun formatRomanNumber(number: Int): String {

        if (number < 10) {
            return formatUnits(number)
        }

        if (number < 100) {
            return formatTenths(number)
        }

        if (number < 1000) {
            return formatHundreds(number)
        }

        return formatThousands(number)
    }


    private fun formatUnits(number: Int) : String =
        when(number) {
            0 -> ""
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            7 -> "VII"
            8 -> "VIII"
            9 -> "IX"
            else -> throw IllegalArgumentException("Not a unit: " + number)
        }

    private fun formatTenths(number: Int) : String =
        when(number) {
            0  -> ""
            10 -> "X"
            20 -> "XX"
            30 -> "XXX"
            40 -> "XL"
            50 -> "L"
            60 -> "LX"
            70 -> "LXX"
            80 -> "LXXX"
            90 -> "XC"
            else -> throw IllegalArgumentException("Not a tenth: " + number)
        }

    private fun formatHundreds(number: Int) : String =
            when(number) {
                100 -> "C"
                200 -> "CC"
                300 -> "CCC"
                400 -> "CD"
                500 -> "D"
                600 -> "DC"
                700 -> "DCC"
                800 -> "DCCC"
                900 -> "CM"
                else -> throw IllegalArgumentException("Not a tenth: " + number)
            }

    private fun  formatThousands(number: Int): String {
        val numberOfThousands = number / 1000
        return "M".repeat(numberOfThousands)
    }

}


