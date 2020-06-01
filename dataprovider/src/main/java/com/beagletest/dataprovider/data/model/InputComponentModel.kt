package com.beagletest.dataprovider.data.model

import com.beagletest.dataprovider.Constants.INPUT
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName(INPUT)
data class InputComponentModel(override val componentName: String = INPUT,
                               val text: String,
                               val type: String) : BaseComponentModel()

