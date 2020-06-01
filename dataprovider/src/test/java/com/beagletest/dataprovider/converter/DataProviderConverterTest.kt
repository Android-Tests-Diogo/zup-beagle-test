package com.beagletest.dataprovider.converter

import com.beagletest.core.components.VerticalComponent
import com.beagletest.dataprovider.data.model.VerticalComponentModel
import com.beagletest.dataprovider.factory.ComponentFactory
import junit.framework.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DataProviderConverterTest {

    @Mock
    lateinit var factory: ComponentFactory

    @Mock
    lateinit var verticalComponent: VerticalComponent

    @Mock
    lateinit var verticalComponentModel: VerticalComponentModel

    @Test
    fun convertTest() {
        // Given
        val converter = DataProviderConverter (factory)

        // When
        `when`(factory.getComponent(verticalComponentModel)).thenReturn(verticalComponent)
        val component  = converter.convert(verticalComponentModel)

        // Then
        assertTrue(component is VerticalComponent)
    }
}
