package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import com.beagletest.core.components.factory.ViewFactory
import com.beagletest.core.utils.GlideUtils.loadImage

class ImageComponent(private val image: String, private val description: String,
                     override val viewFactory: ViewFactory
) : BaseComponent() {

    override fun generateComponent(context: Context, view: ViewGroup) {
        val imageView = viewFactory.createImage(context)
        view.addView(imageView)

        loadImage(context, image, imageView)
    }
}
