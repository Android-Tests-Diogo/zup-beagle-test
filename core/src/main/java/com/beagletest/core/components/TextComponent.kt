package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import com.beagletest.core.components.factory.ViewFactory

class TextComponent (private val text: String,
                     override val viewFactory: ViewFactory
): BaseComponent() {

    override fun generateComponent(context: Context, view: ViewGroup) {
        val textView = viewFactory.createTextView(context)
        textView.text = text
        view.addView(textView)
    }
}
