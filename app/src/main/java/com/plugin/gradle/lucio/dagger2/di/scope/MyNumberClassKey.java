package com.plugin.gradle.lucio.dagger2.di.scope;

import dagger.MapKey;

@MapKey
public @interface MyNumberClassKey {
  Class<? extends Number> value();
}
