package com.dadadata.service

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ServiceActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)


        findViewById<TextView>(R.id.tv_set).text = "${com.dadadata.common.BuildConfig.COMMON_DEBUG_MODE}----${com.dadadata.common.BuildConfig.COMMON_HOST_URL}"
    }
}