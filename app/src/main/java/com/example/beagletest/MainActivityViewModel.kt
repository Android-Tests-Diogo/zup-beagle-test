package com.example.beagletest

import com.beagletest.core.components.IComponent
import com.beagletest.dataprovider.converter.DataProviderConverter
import com.beagletest.dataprovider.repository.DataProviderRepository
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(private val converter: DataProviderConverter,
                                                private val repository: DataProviderRepository) {

    fun getViewComponents() : IComponent {
        return converter.convert(repository.getViewTree())
    }
}
