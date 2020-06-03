package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import com.beagletest.core.components.factory.ViewFactory

class ButtonComponent (private val text: String,
                       override val viewFactory: ViewFactory
) : BaseComponent() {

    override fun generateComponent(context: Context, view: ViewGroup) {
        val button = viewFactory.createButton(context)
        button.text = text
        view.addView(button)
    }
}



