package com.example.interopdemo

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun ComposeText(textString: String) {
    Column {
        Text(textString)
        AndroidView(
            factory = { context ->
                // Creates custom view
                CustomText(context).apply {
                }
            },
            update = { view ->

                view.setText("view inside of compose view")
            }
        )
    }
}