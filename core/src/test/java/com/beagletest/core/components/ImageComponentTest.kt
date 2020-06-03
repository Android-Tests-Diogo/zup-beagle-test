package com.beagletest.core.components

import android.graphics.drawable.Drawable
import android.view.ViewGroup
import android.widget.ImageView
import com.beagletest.core.utils.GlideUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.RequestManager
import com.bumptech.glide.manager.RequestManagerRetriever
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.powermock.api.mockito.PowerMockito

class ImageComponentTest : BaseComponentTest() {

    @Mock
    lateinit var image: ImageView

    @Mock
    lateinit var requestManager: RequestManager

    @Mock
    lateinit var requestManagerRetriever: RequestBuilder<Drawable>


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        PowerMockito.mockStatic(GlideUtils::class.java)
        PowerMockito.mockStatic(Glide::class.java)
        PowerMockito.mockStatic(RequestManager::class.java)
    }

    @Test
    override fun createComponentTest() {
        /*// Given
        val component = ImageComponent("", "", viewFactory)

        // When
        Mockito.`when`(Glide.with(image)).thenReturn(requestManager)
        Mockito.`when`(Glide.with(image).load("")).thenReturn(requestManagerRetriever)
        component.generateComponent(context, linearLayout)
        Mockito.`when`(requestManager.asDrawable().load("")).thenReturn(requestManagerRetriever)
        Mockito.`when`(viewFactory.createImage(context)).thenReturn(image)


        // Then
        Mockito.verify((linearLayout as ViewGroup)).addView(image)
        Mockito.verify(GlideUtils.loadImage(context, "", image))
         */
    }
}
