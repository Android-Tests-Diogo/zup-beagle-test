package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import com.beagletest.core.components.factory.ViewFactory
import javax.inject.Inject

abstract class BaseComponent @Inject constructor() {
    abstract val viewFactory: ViewFactory
    abstract fun  generateComponent(context: Context, view: ViewGroup)
}
