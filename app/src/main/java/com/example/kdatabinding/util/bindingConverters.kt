package com.example.kdatabinding.util

import android.view.View
import androidx.databinding.BindingConversion

object ConverterUtil {
    @JvmStatic
    fun isZero(number: Int): Boolean = number == 0
}

/**
 * The number of likes is an integer and the visibility attribute takes an integer
 * (VISIBLE, GONE and INVISIBLE are 0, 4 and 8 respectively), so we use this converter.
 *
 * There is no need to specify that this converter should be used. [BindingConversion]s are
 * applied automatically.
 */
object BindingConverters {

    @BindingConversion
    @JvmStatic
    fun booleanToVisibility(isNotVisible: Boolean): Int {
        return if (isNotVisible) View.GONE else View.VISIBLE
    }
}