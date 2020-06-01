package com.beagletest.core.utils

import android.content.Context
import android.widget.ImageView
import com.beagletest.core.R
import com.bumptech.glide.Glide

object GlideUtils {
    fun loadImage(context: Context, url: String, imageView: ImageView) {
        Glide.with(context)
            .load(url)
            .placeholder(R.drawable.no_image)
            .fallback(R.drawable.no_image)
            .dontAnimate()
            .into(imageView)
    }
}
