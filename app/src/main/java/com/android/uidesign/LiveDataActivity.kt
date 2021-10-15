package com.android.uidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class LiveDataActivity : AppCompatActivity() {

    private lateinit var cld : ConnectionLiveData

    private lateinit var layout2 : LinearLayout
    private lateinit var layout3 : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        checkNetworkConnection()

        layout2 = findViewById(R.id.layout2)
        layout3 = findViewById(R.id.layout3)

    }

    private fun checkNetworkConnection() {
        cld =   ConnectionLiveData(application)

        cld.observe(this, {isConnected ->
            if(isConnected){
                layout2.visibility = View.VISIBLE
                layout3.visibility = View.GONE
            }
            else {
                layout2.visibility = View.GONE
                layout3.visibility = View.VISIBLE
            }
        })
    }
}