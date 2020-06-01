package com.beagletest.dataprovider.factory

import com.beagletest.core.components.*
import com.beagletest.dataprovider.Constants
import com.beagletest.dataprovider.data.model.*
import com.beagletest.dataprovider.enums.InputTypes
import javax.inject.Inject

class ComponentFactory @Inject constructor(){
    fun getComponent(componentModel: BaseComponentModel) : IComponent {
        return when (componentModel.componentName) {
            Constants.IMAGE -> {
                val imageComponentModel = componentModel as ImageComponentModel
                ImageComponent(imageComponentModel.url, imageComponentModel.text)
            }
            Constants.TEXT -> {
                TextComponent((componentModel as TextComponentModel).text)
            }
            Constants.INPUT -> {
                val inputComponentModel = componentModel as InputComponentModel
                InputComponent(inputComponentModel.text, InputTypes.value(inputComponentModel.type))
            }
            Constants.BUTTON -> {
                ButtonComponent((componentModel as ButtonComponentModel).text)
            }
            Constants.VERTICAL -> {
                val childComponents : MutableList<IComponent> = ArrayList()

                for (item in (componentModel as VerticalComponentModel).children) {
                    childComponents.add(getComponent(item))
                }

                VerticalComponent(childComponents)
            }
            else -> EmptyComponent()
        }
    }
}
