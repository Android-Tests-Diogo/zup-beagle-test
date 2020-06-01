package com.beagletest.dataprovider.data.model

import com.beagletest.dataprovider.Constants.COMPONENT_NAME_FIELD
import kotlinx.serialization.Polymorphic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Polymorphic
@Serializable
abstract class BaseComponentModel {
    @SerialName(COMPONENT_NAME_FIELD)
    abstract val componentName: String
}
