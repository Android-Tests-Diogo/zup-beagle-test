package com.beagletest.core.components

import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class VerticalComponentTest : BaseComponentTest() {

    @Mock
    lateinit var layout: LinearLayout

    @Mock
    lateinit var constraintLayout: ConstraintLayout

    @Test
    override fun createComponentTest() {
        // Given
        val list : MutableList<BaseComponent> = ArrayList()
        list.add(ButtonComponent("", viewFactory))
        val component = VerticalComponent(list, viewFactory)
        val button = Mockito.mock(Button::class.java)

        // When
        Mockito.`when`(viewFactory.createButton(context)).thenReturn(button)
        Mockito.`when`(viewFactory.createLinearLayout(context)).thenReturn(layout)
        component.generateComponent(context, constraintLayout)

        // Then
        Mockito.verify((constraintLayout as ViewGroup)).addView(layout)
    }
}