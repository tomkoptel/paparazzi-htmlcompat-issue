package com.example.mylibrary

import android.view.View
import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class MyPresenterSnapshotTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5,
        theme = "android:Theme.Material.Light.NoActionBar"
        // ...see docs for more options
    )

    @Test
    fun launchView() {
        val view = paparazzi.inflate<View>(R.layout.my_view)
        MyPresenter(view).applyHtml()
        paparazzi.snapshot(view)
    }
}