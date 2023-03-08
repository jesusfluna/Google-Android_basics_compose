package com.example.tipcalculator

import android.icu.text.NumberFormat
import junit.framework.TestCase.assertEquals
import org.junit.Test

class TipCalculatorTest {

    @Test
    fun calculate_20_percent_tip_no_round(){
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}