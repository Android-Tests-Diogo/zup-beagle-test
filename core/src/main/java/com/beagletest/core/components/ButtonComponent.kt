package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import android.widget.Button

class ButtonComponent (private val text: String) : IComponent {
    override fun generateComponent(context: Context, view: ViewGroup) {
        val button = Button(context)
        button.text = text
        view.addView(button)
    }
}



