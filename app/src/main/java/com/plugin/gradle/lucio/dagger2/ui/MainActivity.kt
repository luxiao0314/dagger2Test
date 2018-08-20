package com.plugin.gradle.lucio.dagger2.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.plugin.gradle.lucio.dagger2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_test1.setOnClickListener { startActivity(Intent(this,Test1Activity::class.java)) }
    }
}
