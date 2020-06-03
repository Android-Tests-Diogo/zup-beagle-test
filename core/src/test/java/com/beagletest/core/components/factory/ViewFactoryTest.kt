package com.beagletest.core.components.factory

import android.content.Context
import android.widget.Button
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ViewFactoryTest {

    @Mock
    lateinit var context: Context

    private val viewFactory = ViewFactory()

    @Test
    fun createViewsTest() {
        // Given

        // When
        val button: Button = viewFactory.createButton(context)
        val createImage = viewFactory.createImage(context)
        val createInput = viewFactory.createInput(context)
        val createLinearLayout = viewFactory.createLinearLayout(context)
        val createTextView = viewFactory.createTextView(context)

        // Then
        assertNotEquals(button, null)
        assertNotEquals(createImage, null)
        assertNotEquals(createInput, null)
        assertNotEquals(createLinearLayout, null)
        assertNotEquals(createTextView, null)
    }
}