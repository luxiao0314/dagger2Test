package com.plugin.gradle.lucio.dagger2.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.plugin.gradle.lucio.dagger2.R
import com.plugin.gradle.lucio.dagger2.di.component.DaggerDeComponent
import com.plugin.gradle.lucio.dagger2.di.component.DaggerMainCompoment
import com.plugin.gradle.lucio.dagger2.domain.GirlsBean
import com.plugin.gradle.lucio.dagger2.domain.StudentBean
import kotlinx.android.synthetic.main.activityt_test4.*
import javax.inject.Inject


class Test4Activity : AppCompatActivity() {

    @Inject
    internal lateinit var studentBean: StudentBean

    @Inject
    internal lateinit var girlsBean: GirlsBean

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityt_test4)
        DaggerDeComponent.builder()
                .mainCompoment(DaggerMainCompoment.create())
                .build()
                .inject(this)

        text.text = studentBean.name
        text2.text = girlsBean.name
    }
}
