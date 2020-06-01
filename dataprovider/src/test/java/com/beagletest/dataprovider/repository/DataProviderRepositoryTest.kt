package com.beagletest.dataprovider.repository
import com.beagletest.dataprovider.Constants
import com.beagletest.dataprovider.data.model.VerticalComponentModel
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Test

class DataProviderRepositoryTest {
    @Test
    fun getComponentTest() {
        // Given
        val coreRepository = DataProviderRepository()

        // When
        val containerModel = coreRepository.getViewTree()

        // Then
        assertTrue(containerModel is VerticalComponentModel)
    }
}
