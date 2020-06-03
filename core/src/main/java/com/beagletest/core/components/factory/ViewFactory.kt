package com.beagletest.core.components.factory

import android.content.Context
import android.widget.*
import javax.inject.Inject

class ViewFactory @Inject constructor() {
    fun createButton(context: Context): Button {
        return Button(context)
    }

    fun createTextView(context: Context): TextView {
        return TextView(context)
    }

    fun createImage(context: Context): ImageView {
        return ImageView(context)
    }

    fun createInput(context: Context): EditText {
        return EditText(context)
    }

    fun createLinearLayout(context: Context): LinearLayout {
        return LinearLayout(context)
    }
}