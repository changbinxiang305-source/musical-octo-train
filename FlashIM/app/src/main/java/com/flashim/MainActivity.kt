package com.flashim

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.flashim.protocol.Message

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val msg = Message(text = "Hello, FlashIM!")
        setContentView(android.widget.TextView(this).apply {
            text = msg.text
            textSize = 24f
            gravity = android.view.Gravity.CENTER
        })
    }
}
