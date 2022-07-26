package com.example.workmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.workmanager.LaunchModes.Activity2
import com.example.workmanager.LaunchModes.Activity3
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_2.setOnClickListener { startActivity(Intent(this, Activity2::class.java)) }
        btn_3.setOnClickListener { startActivity(Intent(this, Activity3::class.java)) }
    }
}