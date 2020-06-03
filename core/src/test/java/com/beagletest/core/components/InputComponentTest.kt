package com.beagletest.core.components

import android.view.ViewGroup
import android.widget.EditText
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class InputComponentTest : BaseComponentTest() {

    @Mock
    lateinit var editText: EditText

    @Test
    override fun createComponentTest() {
        // Given
        val component = InputComponent("", 0, viewFactory)

        // When
        Mockito.`when`(viewFactory.createInput(context)).thenReturn(editText)
        component.generateComponent(context, linearLayout)

        // Then
        Mockito.verify((linearLayout as ViewGroup)).addView(editText)
    }
}