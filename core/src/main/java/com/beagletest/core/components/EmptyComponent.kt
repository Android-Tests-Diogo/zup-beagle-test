package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import com.beagletest.core.components.factory.ViewFactory

class EmptyComponent(override val viewFactory: ViewFactory) : BaseComponent() {
    override fun generateComponent(context: Context, view: ViewGroup) {}
}
