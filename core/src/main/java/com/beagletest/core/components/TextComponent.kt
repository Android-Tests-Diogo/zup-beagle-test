package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import android.widget.TextView

class TextComponent (private val text: String): IComponent {
    override fun generateComponent(context: Context, view: ViewGroup) {
        val textView = TextView(context)
        textView.text = text
        view.addView(textView)
    }
}
