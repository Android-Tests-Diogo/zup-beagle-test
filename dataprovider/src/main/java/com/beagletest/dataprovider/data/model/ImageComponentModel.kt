package com.beagletest.dataprovider.data.model

import com.beagletest.dataprovider.Constants.IMAGE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName(IMAGE)
data class ImageComponentModel(override val componentName: String = IMAGE,
                               val url: String,
                               val text: String) : BaseComponentModel()
