package com.example.interopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.compose.ui.platform.ComposeView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        this.findViewById<TextView>(R.id.activity_text)?.text = "Activity Text"

        this.findViewById<ComposeView>(R.id.compose_view)?.setContent {
            ComposeText("A compose view")
        }
    }

}