package com.beagletest.core.components

import android.view.ViewGroup
import android.widget.TextView
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class TextComponentTest : BaseComponentTest() {
    @Mock
    lateinit var textView: TextView

    @Test
    override fun createComponentTest() {
        // Given
        val string = "Text"
        val component = TextComponent(string, viewFactory)

        // When
        Mockito.`when`(viewFactory.createTextView(context)).thenReturn(textView)
        component.generateComponent(context, linearLayout)

        // Then
        Mockito.verify((linearLayout as ViewGroup)).addView(textView)
        Mockito.verify(textView).text = string
    }
}