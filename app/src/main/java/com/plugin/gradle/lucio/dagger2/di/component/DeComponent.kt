package com.plugin.gradle.lucio.dagger2.di.component

import com.plugin.gradle.lucio.dagger2.di.scope.SubScope
import com.plugin.gradle.lucio.dagger2.ui.Test4Activity
import dagger.Component

/**
 * @Description
 * @Author sean
 * @Email xiao.lu@magicwindow.cn
 * @Date 21/08/2018 4:50 PM
 * @Version
 */
@SubScope
@Component(dependencies = [MainCompoment::class])
interface DeComponent {
    fun inject(test4Activity: Test4Activity)
}