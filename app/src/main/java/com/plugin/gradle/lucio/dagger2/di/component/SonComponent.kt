package com.plugin.gradle.lucio.dagger2.di.component

import com.plugin.gradle.lucio.dagger2.di.module.AppleModule
import com.plugin.gradle.lucio.dagger2.ui.Test5Activity
import dagger.Subcomponent



/**
 * @Description
 * @Author sean
 * @Email xiao.lu@magicwindow.cn
 * @Date 21/08/2018 4:50 PM
 * @Version
 */
@Subcomponent(modules = [AppleModule::class])
interface SonComponent {

    fun inject(test5Activity: Test5Activity)

    @Subcomponent.Builder
    interface Builder {
        fun appleModule(module: AppleModule): Builder
        fun build(): SonComponent
    }
}