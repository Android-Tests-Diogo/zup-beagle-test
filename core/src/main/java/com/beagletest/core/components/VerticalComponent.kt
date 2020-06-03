package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import android.widget.LinearLayout.VERTICAL
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.beagletest.core.components.factory.ViewFactory

class VerticalComponent (private val childComponents: List<BaseComponent>,
                         override val viewFactory: ViewFactory
): BaseComponent() {

    override fun generateComponent(context: Context, view: ViewGroup) {
        val verticalView = viewFactory.createLinearLayout(context)
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
