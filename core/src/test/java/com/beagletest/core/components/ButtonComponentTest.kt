package com.beagletest.core.components

import android.view.ViewGroup
import android.widget.Button
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`

class ButtonComponentTest : BaseComponentTest() {

    @Mock
    lateinit var button: Button

    @Test
    override fun createComponentTest() {
        // Given
        val component = ButtonComponent("", viewFactory)

        // When
        `when`(viewFactory.createButton(context)).thenReturn(button)
        component.generateComponent(context, linearLayout)

        // Then
        Mockito.verify((linearLayout as ViewGroup)).addView(button)
        Mockito.verify(button).text = Mockito.anyString()
    }
}