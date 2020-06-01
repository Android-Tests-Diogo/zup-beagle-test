package com.beagletest.dataprovider.repository

import com.beagletest.dataprovider.data.model.BaseComponentModel
import com.beagletest.dataprovider.data.model.EmptyComponentModel
import com.beagletest.dataprovider.data.model.VerticalComponentModel
import com.beagletest.dataprovider.utils.DeserializeData.deserialize
import com.beagletest.dataprovider.utils.JsonProvider
import java.lang.Exception
import javax.inject.Inject

class DataProviderRepository @Inject constructor() {
    fun getViewTree() : BaseComponentModel {
        return try {
            deserialize(JsonProvider().provide4())
        } catch (exception: Exception) {
            EmptyComponentModel()
        }
    }
}
