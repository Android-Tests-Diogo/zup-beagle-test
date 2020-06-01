package com.beagletest.core.components

import android.content.Context
import android.view.ViewGroup
import android.widget.ImageView
import com.beagletest.core.utils.GlideUtils.loadImage

class ImageComponent(private val image: String, private val description: String) : IComponent {
    override fun generateComponent(context: Context, view: ViewGroup) {
        val imageView = ImageView(context)
        view.addView(imageView)

        loadImage(context, image, imageView)
    }
}
