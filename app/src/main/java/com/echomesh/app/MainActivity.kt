package com.echomesh.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = TextView(this).apply {
            text = "EchoMesh: Cloud Build SUCCESS"
            textSize = 22f
            setTextColor(Color.GREEN)
            setBackgroundColor(Color.BLACK)
            gravity = Gravity.CENTER
        }
        setContentView(text)
    }
}
