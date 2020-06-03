package com.beagletest.dataprovider.factory

import com.beagletest.core.components.*
import com.beagletest.core.components.factory.ViewFactory
import com.beagletest.dataprovider.Constants
import com.beagletest.dataprovider.data.model.*
import com.beagletest.dataprovider.enums.InputTypes
import javax.inject.Inject

class ComponentFactory @Inject constructor(private val viewFactory: ViewFactory){
    fun getComponent(componentModel: BaseComponentModel) : BaseComponent {
        return when (componentModel.componentName) {
            Constants.IMAGE -> {
                val imageComponentModel = componentModel as ImageComponentModel
                ImageComponent(imageComponentModel.url, imageComponentModel.text, viewFactory)
            }
            Constants.TEXT -> {
                TextComponent((componentModel as TextComponentModel).text, viewFactory)
            }
            Constants.INPUT -> {
                val inputComponentModel = componentModel as InputComponentModel
                InputComponent(inputComponentModel.text, InputTypes.value(inputComponentModel.type), viewFactory)
            }
            Constants.BUTTON -> {
                ButtonComponent((componentModel as ButtonComponentModel).text, viewFactory)
            }
            Constants.VERTICAL -> {
                val childComponents : MutableList<BaseComponent> = ArrayList()

                for (item in (componentModel as VerticalComponentModel).children) {
                    childComponents.add(getComponent(item))
                }

                VerticalComponent(childComponents, viewFactory)
            }
            else -> EmptyComponent(viewFactory)
        }
    }
}
