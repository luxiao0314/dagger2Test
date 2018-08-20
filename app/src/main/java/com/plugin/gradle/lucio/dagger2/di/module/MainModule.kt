package com.plugin.gradle.lucio.dagger2.di.module

import com.plugin.gradle.lucio.dagger2.domain.StudentBean
import com.plugin.gradle.lucio.dagger2.domain.TeacherBean
import dagger.Module
import dagger.Provides

/**
 * @Description
 * @Author sean
 * @Email xiao.lu@magicwindow.cn
 * @Date 20/08/2018 7:51 PM
 * @Version
 */
@Module
class MainModule {

    @Provides
    fun provideStudentBean(): StudentBean = StudentBean()

    @Provides
    fun provideTeacherBean(studentBean: StudentBean): TeacherBean = TeacherBean(studentBean)
}