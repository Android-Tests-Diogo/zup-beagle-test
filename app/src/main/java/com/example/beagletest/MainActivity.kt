package com.example.beagletest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainActivityViewModel

    lateinit var simpleComponent: SimpleComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        generateDaggerComponent()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectComponent()
        generateViewWidgets()
    }

    private fun generateDaggerComponent() {
        simpleComponent = DaggerSimpleComponent.builder().build()
    }

    private fun injectComponent() {
        simpleComponent.inject(this)
    }

    private fun generateViewWidgets() {
        viewModel.getViewComponents().generateComponent(this, containerParent)
    }
}
