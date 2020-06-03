package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import com.beagletest.core.components.factory.ViewFactory

class InputComponent (val hint: String = "", val inputType: Int,
                      override val viewFactory: ViewFactory
): BaseComponent() {

    override fun generateComponent(context: Context, view: ViewGroup) {
        val editText = viewFactory.createInput(context)
        view.addView(editText)
    }
}
