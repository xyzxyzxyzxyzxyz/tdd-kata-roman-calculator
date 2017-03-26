package com.tdd.katas.romancalculator

class RomanNumberFormatter {

    fun formatRomanNumber(number: Int): String {

        var number = number

        val formattedNumber = StringBuilder()

        val numberOfThousands = number / 1000
        formattedNumber.append(formatThousands(numberOfThousands))

        number %= 1000
        val numberOfHundreds = number / 100
        formattedNumber.append(formatHundreds(numberOfHundreds))

        number %= 100
        val numberOfTenths = number / 10
        formattedNumber.append(formatTenths(numberOfTenths))

        number %= 10
        formattedNumber.append(formatUnits(number))

        return formattedNumber.toString()
    }


    private fun formatUnits(numberOfUnits: Int) : String =
        when(numberOfUnits) {
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
            else -> throw IllegalArgumentException("Not a unit: " + numberOfUnits)
        }

    private fun formatTenths(numberOfTenths: Int) : String =
        when(numberOfTenths) {
            0 -> ""
            1 -> "X"
            2 -> "XX"
            3 -> "XXX"
            4 -> "XL"
            5 -> "L"
            6 -> "LX"
            7 -> "LXX"
            8 -> "LXXX"
            9 -> "XC"
            else -> throw IllegalArgumentException("Not a tenth: " + numberOfTenths)
        }

    private fun formatHundreds(numberOfHundreds: Int) : String =
            when(numberOfHundreds) {
                0 -> ""
                1 -> "C"
                2 -> "CC"
                3 -> "CCC"
                4 -> "CD"
                5 -> "D"
                6 -> "DC"
                7 -> "DCC"
                8 -> "DCCC"
                9 -> "CM"
                else -> throw IllegalArgumentException("Not a hundred: " + numberOfHundreds)
            }

    private fun formatThousands(numberOfThousands: Int) : String {
        return "M".repeat(numberOfThousands)
    }

}


