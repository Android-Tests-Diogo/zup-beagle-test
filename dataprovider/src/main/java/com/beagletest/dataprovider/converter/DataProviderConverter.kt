package com.beagletest.dataprovider.converter

import com.beagletest.core.components.BaseComponent
import com.beagletest.dataprovider.data.model.BaseComponentModel
import com.beagletest.dataprovider.factory.ComponentFactory
import javax.inject.Inject

class DataProviderConverter @Inject constructor(private val factory: ComponentFactory) {
    fun convert(base: BaseComponentModel): BaseComponent {
        return factory.getComponent(base)
    }
}
