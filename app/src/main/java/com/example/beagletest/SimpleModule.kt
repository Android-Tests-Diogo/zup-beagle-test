package com.example.beagletest

import com.beagletest.dataprovider.converter.DataProviderConverter
import com.beagletest.dataprovider.repository.DataProviderRepository
import dagger.Module
import dagger.Provides

@Module
class SimpleModule {

    @Provides
    fun providesMainActivityViewModel(converter: DataProviderConverter,
                                      repository: DataProviderRepository) : MainActivityViewModel {
        return MainActivityViewModel(converter, repository)
    }
}
