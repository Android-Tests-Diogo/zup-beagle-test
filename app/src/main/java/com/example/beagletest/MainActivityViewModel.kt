package com.example.beagletest

import com.beagletest.core.components.BaseComponent
import com.beagletest.dataprovider.converter.DataProviderConverter
import com.beagletest.dataprovider.repository.DataProviderRepository
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(private val converter: DataProviderConverter,
                                                private val repository: DataProviderRepository) {

    fun getViewComponents() : BaseComponent {
        return converter.convert(repository.getViewTree())
    }
}
