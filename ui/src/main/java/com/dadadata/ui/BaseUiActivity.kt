package com.dadadata.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BaseUiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_ui)
    }
}