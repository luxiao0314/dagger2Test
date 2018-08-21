package com.plugin.gradle.lucio.dagger2.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.plugin.gradle.lucio.dagger2.R
import com.plugin.gradle.lucio.dagger2.di.component.DaggerMainCompoment
import com.plugin.gradle.lucio.dagger2.di.module.MainModule
import com.plugin.gradle.lucio.dagger2.domain.BoysBean
import com.plugin.gradle.lucio.dagger2.domain.GirlsBean
import com.plugin.gradle.lucio.dagger2.domain.StudentBean
import com.plugin.gradle.lucio.dagger2.domain.TeacherBean
import kotlinx.android.synthetic.main.activityt_test1.*
import javax.inject.Inject

/**
 * 通过module进行注入
 */
class Test2Activity : AppCompatActivity() {

    @Inject
    internal lateinit var studentBean: StudentBean

    @Inject
    internal lateinit var teacherBean: TeacherBean

    @Inject
    internal lateinit var boysBean: BoysBean
    @Inject
    internal lateinit var boysBean2: BoysBean

    @Inject
    internal lateinit var girlsBean: GirlsBean
    @Inject
    internal lateinit var girlsBean2: GirlsBean

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityt_test2)
        val build = DaggerMainCompoment.builder()
                .mainModule(MainModule())
                .build()
        build.inject(this)

        val provideStudentBean = build.provideStudentBean()
        Log.e("test2", "provideStudentBean  " + provideStudentBean.name + provideStudentBean.num)

        text.text = "学生: " + studentBean.name + studentBean.num
        text2.text = "老师: " + teacherBean.studentBean.name + teacherBean.studentBean.num

        Log.e("test2", "girlsBean  " + girlsBean.toString())
        Log.e("test2", "girlsBean2  " + girlsBean2.toString())
        Log.e("test2", "boysBean  " + boysBean.toString())
        Log.e("test2", "boysBean2  " + boysBean2.toString())

    }
}
