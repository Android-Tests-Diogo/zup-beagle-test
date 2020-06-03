package com.beagletest.dataprovider.factory

import com.beagletest.core.components.*
import com.beagletest.core.components.factory.ViewFactory
import com.beagletest.dataprovider.Constants.BUTTON
import com.beagletest.dataprovider.Constants.IMAGE
import com.beagletest.dataprovider.Constants.INPUT
import com.beagletest.dataprovider.Constants.TEXT
import com.beagletest.dataprovider.Constants.VERTICAL
import com.beagletest.dataprovider.data.model.*
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ComponentFactoryTest {

    @Mock
    lateinit var viewFactory: ViewFactory

    lateinit var factory: ComponentFactory

    @Before
    fun setUp() {
        factory = ComponentFactory(viewFactory)
    }

    @Test
    fun createVerticalComponent(){
        // Given
        val verticalComponentModelGiven = Mockito.mock(VerticalComponentModel::class.java)
        val list  : MutableList<VerticalComponentModel> = ArrayList()
        list.add(VerticalComponentModel())

        // When
        `when`(verticalComponentModelGiven.componentName).thenReturn(VERTICAL)
        `when`(verticalComponentModelGiven.children).thenReturn(list)
        val verticalComponent = factory.getComponent(verticalComponentModelGiven)

        // Then
        assertTrue(verticalComponent is VerticalComponent)
    }

    @Test
    fun createImageComponent(){
        // Given
        val componentModelGiven = Mockito.mock(ImageComponentModel::class.java)

        // When
        `when`(componentModelGiven.componentName).thenReturn(IMAGE)
        `when`(componentModelGiven.url).thenReturn("")
        `when`(componentModelGiven.text).thenReturn("")
        val component = factory.getComponent(componentModelGiven)

        // Then
        assertTrue(component is ImageComponent)
    }

    @Test
    fun createTextComponent(){
        // Given
        val componentModelGiven = Mockito.mock(TextComponentModel::class.java)

        // When
        `when`(componentModelGiven.componentName).thenReturn(TEXT)
        `when`(componentModelGiven.text).thenReturn("")
        val component = factory.getComponent(componentModelGiven)

        // Then
        assertTrue(component is TextComponent)
    }

    @Test
    fun createInputComponent(){
        // Given
        val componentModelGiven = Mockito.mock(InputComponentModel::class.java)

        // When
        `when`(componentModelGiven.componentName).thenReturn(INPUT)
        `when`(componentModelGiven.text).thenReturn("")
        `when`(componentModelGiven.type).thenReturn("Age")
        val component = factory.getComponent(componentModelGiven)

        // Then
        assertTrue(component is InputComponent)
    }

    @Test
    fun createButtonComponent(){
        // Given
        val componentModelGiven = Mockito.mock(ButtonComponentModel::class.java)

        // When
        `when`(componentModelGiven.componentName).thenReturn(BUTTON)
        `when`(componentModelGiven.text).thenReturn("")
         val component = factory.getComponent(componentModelGiven)

        // Then
        assertTrue(component is ButtonComponent)
    }

    @Test
    fun createEmptyComponent(){
        // Given
        val componentModelGiven = Mockito.mock(VerticalComponentModel::class.java)

        // When
        `when`(componentModelGiven.componentName).thenReturn("")
        val component = factory.getComponent(componentModelGiven)

        // Then
        assertTrue(component is EmptyComponent)
    }

}
