package com.example.beagletest

import dagger.Component

@Component(modules = [SimpleModule::class])
interface SimpleComponent {
    fun inject(mainActivity: MainActivity)
}
