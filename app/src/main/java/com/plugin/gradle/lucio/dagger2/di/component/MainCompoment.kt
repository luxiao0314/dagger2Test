package com.plugin.gradle.lucio.dagger2.di.component

import com.plugin.gradle.lucio.dagger2.ui.Test1Activity
import dagger.Component

/**
 * @Description
 * @Author sean
 * @Email xiao.lu@magicwindow.cn
 * @Date 20/08/2018 5:27 PM
 * @Version
 */
@Component
interface MainCompoment {
    fun inject(test1Activity: Test1Activity)
}