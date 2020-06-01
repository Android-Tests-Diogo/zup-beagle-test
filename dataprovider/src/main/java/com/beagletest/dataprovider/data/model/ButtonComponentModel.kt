package com.beagletest.dataprovider.data.model

import com.beagletest.dataprovider.Constants.BUTTON
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName(BUTTON)
data class ButtonComponentModel(override  val componentName: String = BUTTON,
                                val text: String) : BaseComponentModel()

