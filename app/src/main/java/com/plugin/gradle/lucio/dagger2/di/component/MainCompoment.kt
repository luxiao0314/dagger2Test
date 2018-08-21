package com.plugin.gradle.lucio.dagger2.di.component

import com.plugin.gradle.lucio.dagger2.di.module.MainModule
import com.plugin.gradle.lucio.dagger2.di.scope.ActivityScope
import com.plugin.gradle.lucio.dagger2.domain.StudentBean
import com.plugin.gradle.lucio.dagger2.ui.Test1Activity
import com.plugin.gradle.lucio.dagger2.ui.Test2Activity
import dagger.Component

/**
 * @Description
 * @Author sean
 * @Email xiao.lu@magicwindow.cn
 * @Date 20/08/2018 5:27 PM
 * @Version
 */
@ActivityScope
@Component(modules = [MainModule::class])
interface MainCompoment {

    fun inject(test1Activity: Test1Activity)

    fun inject(test2Activity: Test2Activity)

    fun provideStudentBean(): StudentBean
}