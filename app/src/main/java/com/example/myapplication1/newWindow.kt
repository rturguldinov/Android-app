package com.example.myapplication1

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import com.example.myapplication1.R

@SuppressLint("Registered")
class newWindow: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_window)
    }
}
