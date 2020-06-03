package com.example.beagletest

import com.beagletest.core.components.VerticalComponent
import com.beagletest.dataprovider.converter.DataProviderConverter
import com.beagletest.dataprovider.data.model.VerticalComponentModel
import com.beagletest.dataprovider.repository.DataProviderRepository
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner
import javax.inject.Inject

@RunWith(MockitoJUnitRunner::class)
class MainActivityViewModelTest {

    @Mock
    lateinit var converter: DataProviderConverter

    @Mock
    lateinit var repository: DataProviderRepository

    @Mock
    lateinit var verticalComponentModel: VerticalComponentModel

    @Mock
    lateinit var baseComponent: VerticalComponent

    @Test
    fun getViewTreeTest() {
        // Given
        val viewModel = MainActivityViewModel(converter, repository)

        // When
        `when`(repository.getViewTree()).thenReturn(verticalComponentModel)
        `when`(converter.convert(verticalComponentModel)).thenReturn(baseComponent)
        val componentTree = viewModel.getViewComponents()

        // Then
        assertTrue(componentTree is VerticalComponent)
    }
}
