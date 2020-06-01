package com.beagletest.dataprovider.enums

import android.text.InputType

enum class InputTypes(val inputTypeDynamic: String, val inputType: Int) {
    None("",0),
    Age("age", InputType.TYPE_CLASS_NUMBER);

    companion object {
        fun value(inputTypeDynamic: String) : Int {
            for (enum in values()) {
                if (inputTypeDynamic == enum.inputTypeDynamic) {
                    return enum.inputType
                }
            }

            return None.inputType
        }
    }
}
