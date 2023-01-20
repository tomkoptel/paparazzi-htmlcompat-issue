package com.example.mylibrary

import android.view.View
import android.widget.TextView
import androidx.core.text.HtmlCompat

class MyPresenter(root: View) {
    private val textView = root.findViewById<TextView>(android.R.id.text1)

    fun applyHtml() {
        textView.text = HtmlCompat.fromHtml(
            textView.context.getString(R.string.help, "some@email.com"),
            HtmlCompat.FROM_HTML_MODE_LEGACY
        )
    }
}