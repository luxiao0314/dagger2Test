package com.plugin.gradle.lucio.dagger2.di.module

import com.plugin.gradle.lucio.dagger2.domain.AppleBean

import dagger.Module
import dagger.Provides

@Module
class AppleModule {
    @Provides
    fun privdeApple(): AppleBean = AppleBean("这是一个苹果")
}