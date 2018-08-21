package com.plugin.gradle.lucio.dagger2.di.module

import com.plugin.gradle.lucio.dagger2.di.component.SonComponent
import com.plugin.gradle.lucio.dagger2.di.scope.ActivityScope
import com.plugin.gradle.lucio.dagger2.domain.BoysBean
import com.plugin.gradle.lucio.dagger2.domain.GirlsBean
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
@Module(subcomponents = [SonComponent::class])
class MainModule {

    @Provides
    fun provideStudentBean(): StudentBean = StudentBean()

    @Provides
    fun provideTeacherBean(studentBean: StudentBean): TeacherBean = TeacherBean(studentBean)

    @Provides
    fun provideGirlsBean(): GirlsBean = GirlsBean()

    @ActivityScope
    @Provides
    fun provideBoysBean(): BoysBean = BoysBean()
}