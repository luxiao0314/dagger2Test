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
        btn_test2.setOnClickListener { startActivity(Intent(this,Test2Activity::class.java)) }
        btn_test3.setOnClickListener { startActivity(Intent(this,Test3Activity::class.java)) }
        btn_test4.setOnClickListener { startActivity(Intent(this, Test4Activity::class.java)) }
        btn_test5.setOnClickListener { startActivity(Intent(this, Test5Activity::class.java)) }
    }
}
