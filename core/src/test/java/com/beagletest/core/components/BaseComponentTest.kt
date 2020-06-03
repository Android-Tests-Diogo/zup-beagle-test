package com.beagletest.core.components

import android.content.Context
import android.widget.LinearLayout
import com.beagletest.core.components.factory.ViewFactory
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
abstract class BaseComponentTest {

    @Mock
    lateinit var context: Context

    @Mock
    lateinit var linearLayout: LinearLayout

    @Mock
    lateinit var viewFactory: ViewFactory

    abstract fun createComponentTest()
}