package com.plugin.gradle.lucio.dagger2.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.plugin.gradle.lucio.dagger2.R
import com.plugin.gradle.lucio.dagger2.di.component.DaggerMainCompoment
import com.plugin.gradle.lucio.dagger2.domain.StudentBean
import com.plugin.gradle.lucio.dagger2.domain.TeacherBean
import kotlinx.android.synthetic.main.activityt_test1.*
import javax.inject.Inject

/**
 * 构造方式注入
 */
class Test1Activity : AppCompatActivity() {

    @Inject
    internal lateinit var studentBean: StudentBean

    @Inject
    internal lateinit var teacherBean: TeacherBean

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityt_test1)
        DaggerMainCompoment.create().inject(this)

        text.text = "学生: " + studentBean.name + studentBean.num
        text2.text = "老师: " + teacherBean.studentBean.name + teacherBean.studentBean.num

    }
}
