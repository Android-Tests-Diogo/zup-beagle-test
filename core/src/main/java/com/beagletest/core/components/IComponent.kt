package com.beagletest.core.components

import android.content.Context
import android.view.View
import android.view.ViewGroup

interface IComponent {
    fun generateComponent(context: Context, view: ViewGroup)
}
