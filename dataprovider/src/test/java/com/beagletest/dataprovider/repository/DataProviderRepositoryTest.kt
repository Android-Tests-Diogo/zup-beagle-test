package com.beagletest.dataprovider.repository
import com.beagletest.dataprovider.Constants
import junit.framework.Assert.assertEquals
import org.junit.Test

class DataProviderRepositoryTest {
    @Test
    fun getComponentTest() {
        // Given
        val coreRepository = DataProviderRepository()

        // When
        val containerModel = coreRepository.getViewTree()

        // Then
        assertEquals(Constants.VERTICAL, containerModel.componentName)
    }
}
