package com.beagletest.dataprovider.data.model

import com.beagletest.dataprovider.Constants.TEXT
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName(TEXT)
data class TextComponentModel(override val componentName: String = TEXT,
                              val text: String) : BaseComponentModel()

