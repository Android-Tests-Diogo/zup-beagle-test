package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import android.widget.EditText

class InputComponent (val hint: String = "", val inputType: Int): IComponent {
    override fun generateComponent(context: Context, view: ViewGroup) {
        val editText = EditText(context)
        view.addView(editText)
    }
}
