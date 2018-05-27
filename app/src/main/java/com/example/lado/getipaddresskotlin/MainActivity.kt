package com.example.lado.getipaddresskotlin

import android.content.Context
import android.net.wifi.WifiManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.format.Formatter
import android.view.View
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal var textView: TextView? = null
    internal var getIP: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.getIP) as TextView
        getIP = findViewById(R.id.press) as Button

        getIP!!.setOnClickListener {
            val wifiManager = getSystemService(Context.WIFI_SERVICE) as WifiManager
            val ipAddress = Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress)
            textView!!.text = "Your Device IP Address: " + ipAddress
        }
    }
}
