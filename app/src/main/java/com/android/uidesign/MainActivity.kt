package com.android.uidesign

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val foodNinjaText by lazy {
            findViewById<TextView>(R.id.foodNinjaText)
        }
        val textView2 by lazy {
            findViewById<TextView>(R.id.textView_forgot)
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
           foodNinjaText.gradient()
           textView2.gradient()
    }
   private fun TextView.gradient() {
        val width = paint.measureText(text.toString())
        val textShader: Shader = LinearGradient(
            0f,
            0f,
            width,
            this.textSize,
            Color.parseColor("#53E88B"),
            Color.parseColor("#15BE77"),
            Shader.TileMode.CLAMP
        )
       paint.shader = textShader
    }
}