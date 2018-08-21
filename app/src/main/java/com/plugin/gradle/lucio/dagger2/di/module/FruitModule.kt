package com.plugin.gradle.lucio.dagger2.di.module

import com.plugin.gradle.lucio.dagger2.domain.BananaBean
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet



@Module
class FruitModule {

    @Provides
    @IntoSet
    fun providerBanana(): BananaBean = BananaBean("特朗普香蕉")

    @Provides
    @ElementsIntoSet
    fun providerBananaSet(): Set<BananaBean> {
        val set = HashSet<BananaBean>()
        set.add(BananaBean("布什香蕉"))
        set.add(BananaBean("约翰逊香蕉"))
        return set
    }
}