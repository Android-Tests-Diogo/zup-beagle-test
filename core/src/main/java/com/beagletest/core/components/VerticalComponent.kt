package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.LinearLayout.VERTICAL
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class VerticalComponent (private val childComponents: List<IComponent>): IComponent {

    override fun generateComponent(context: Context, view: ViewGroup) {
        val verticalView = LinearLayout(context)
        verticalView.orientation = VERTICAL

        if (view is ConstraintLayout) {
            val constraintSet = ConstraintSet()
            constraintSet.clone(view)
        }

        view.addView(verticalView)

        if (childComponents.isNotEmpty()) {
            for (item in childComponents) {
                item.generateComponent(context, verticalView)
            }
        }
    }
}
