package com.beagletest.core.components

import android.content.Context
import android.widget.LinearLayout
import com.beagletest.core.components.factory.ViewFactory
import com.beagletest.core.utils.GlideUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import org.junit.runner.RunWith
import org.mockito.Mock
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
@PrepareForTest(ViewFactory::class, GlideUtils::class, Glide::class, RequestManager::class)
abstract class BaseComponentTest {

    @Mock
    lateinit var context: Context

    @Mock
    lateinit var linearLayout: LinearLayout

    @Mock
    lateinit var viewFactory: ViewFactory

    abstract fun createComponentTest()
}
