package com.beagletest.core.components

import android.view.ViewGroup
import android.widget.ImageView
import com.beagletest.core.utils.GlideUtils
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class ImageComponentTest : BaseComponentTest() {

    @Mock
    lateinit var image: ImageView

    @Test
    override fun createComponentTest() {
        // Given
        val component = ImageComponent("", "", viewFactory)

        // When
        Mockito.`when`(viewFactory.createImage(context)).thenReturn(image)
        component.generateComponent(context, linearLayout)

        // Then
        Mockito.verify((linearLayout as ViewGroup)).addView(image)
        Mockito.verify(GlideUtils.loadImage(context, "", image))
    }
}