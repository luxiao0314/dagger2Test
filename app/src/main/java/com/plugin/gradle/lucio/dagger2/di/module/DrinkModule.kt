package com.plugin.gradle.lucio.dagger2.di.module

import com.plugin.gradle.lucio.dagger2.domain.AppleBean
import com.plugin.gradle.lucio.dagger2.domain.BananaBean
import com.plugin.gradle.lucio.dagger2.ui.Test3Activity
import dagger.Module
import dagger.Provides
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey





@Module
class DrinkModule {

    @Provides
    @IntoSet
    fun providerBanana(): BananaBean = BananaBean("巴拿马香蕉")

    @Provides
    @IntoMap // 指定该@Provides方法向Map提供元素
    @StringKey("A") // 指定该元素在Map中所对应的的Key
    fun providerApple(): AppleBean = AppleBean("A苹果")

    @Provides
    @IntoMap
    @ClassKey(Test3Activity::class)
    fun providerAppleMap(): AppleBean = AppleBean("北京苹果")
}