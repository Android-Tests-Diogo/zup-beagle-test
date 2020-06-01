package com.beagletest.dataprovider.data.model

import com.beagletest.dataprovider.Constants.VERTICAL
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName(VERTICAL)
data class VerticalComponentModel(override  val componentName: String = VERTICAL,
                                  val children: List<BaseComponentModel> = ArrayList()) : BaseComponentModel()

