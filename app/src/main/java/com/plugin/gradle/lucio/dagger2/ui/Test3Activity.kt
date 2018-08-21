package com.plugin.gradle.lucio.dagger2.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.plugin.gradle.lucio.dagger2.R
import com.plugin.gradle.lucio.dagger2.di.component.DaggerMainCompoment
import com.plugin.gradle.lucio.dagger2.domain.AppleBean
import com.plugin.gradle.lucio.dagger2.domain.BananaBean
import kotlinx.android.synthetic.main.activityt_test3.*
import java.lang.StringBuilder
import javax.inject.Inject

/**
 * 通过module进行注入
 */
class Test3Activity : AppCompatActivity() {

    @Inject
    internal lateinit var studentBean: Set<BananaBean>
    @Inject
    internal lateinit var appleBean: Map<String, AppleBean>
    @Inject
    internal lateinit var appleBean2: Map<Class<*>, AppleBean>

    @Inject
    internal lateinit var enum2: Map<Class<out Number>, String>

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityt_test3)
        DaggerMainCompoment.create().inject(this)

        val stringBuilder1 = StringBuilder()
        val stringBuilder2 = StringBuilder()
        val stringBuilder3 = StringBuilder()
        val stringBuilder4 = StringBuilder()
        val stringBuilder5 = StringBuilder()
        studentBean.forEach {
            stringBuilder1.append(it.name + "  ")
        }
        appleBean.forEach {
            stringBuilder2.append(it.value.name + "  ")
        }
        appleBean2.forEach {
            stringBuilder3.append(it.value.name + "  ")
        }
        text.text = stringBuilder1
        text2.text = stringBuilder2
        text3.text = stringBuilder3

        enum2.forEach { stringBuilder5.append(it.value) }

        text5.text = stringBuilder5
    }
}
