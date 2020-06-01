package com.beagletest.dataprovider.converter

import com.beagletest.core.components.IComponent
import com.beagletest.dataprovider.data.model.BaseComponentModel
import com.beagletest.dataprovider.factory.ComponentFactory
import javax.inject.Inject

class DataProviderConverter @Inject constructor(private val factory: ComponentFactory) {
    fun convert(base: BaseComponentModel): IComponent {
        return factory.getComponent(base)
    }
}
