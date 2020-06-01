package com.beagletest.dataprovider.utils

import com.beagletest.dataprovider.Constants
import com.beagletest.dataprovider.data.model.*
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.modules.SerializersModule

object DeserializeData {
    fun deserialize(json: String) : BaseComponentModel {
        val module = SerializersModule {
            polymorphic(BaseComponentModel::class) {
                VerticalComponentModel::class with VerticalComponentModel.serializer()
                ButtonComponentModel:: class with ButtonComponentModel.serializer()
                TextComponentModel:: class with TextComponentModel.serializer()
                ImageComponentModel::class with ImageComponentModel.serializer()
                InputComponentModel::class with InputComponentModel.serializer()
            }
        }

        Json(JsonConfiguration.Stable.copy(classDiscriminator = Constants.COMPONENT_NAME_FIELD),
            context = module).apply {
            return parse(PolymorphicSerializer(BaseComponentModel::class), json)
        }
    }
}
