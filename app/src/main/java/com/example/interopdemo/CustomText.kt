package com.example.interopdemo

import android.content.Context
import android.widget.TextView

class CustomText (context: Context): androidx.appcompat.widget.AppCompatTextView(context) {
    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText("X" + text + "X", type)
    }

}