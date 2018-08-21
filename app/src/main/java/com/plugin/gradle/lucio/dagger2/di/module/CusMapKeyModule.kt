package com.plugin.gradle.lucio.dagger2.di.module

import com.plugin.gradle.lucio.dagger2.di.scope.CusEnum
import com.plugin.gradle.lucio.dagger2.di.scope.CusEnumKey
import com.plugin.gradle.lucio.dagger2.di.scope.MyNumberClassKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import java.math.BigDecimal


/**
 * @Description
 * @Author sean
 * @Email xiao.lu@magicwindow.cn
 * @Date 21/08/2018 4:48 PM
 * @Version
 */
@Module
class CusMapKeyModule {

    @Provides
    @IntoMap
    @CusEnumKey(CusEnum.ABC)
    fun provideABCValue(): String = "value for ABC"

    @Provides
    @IntoMap
    @MyNumberClassKey(BigDecimal::class)
    fun provideBigDecimalValue(): String = "value for BigDecimal"
}