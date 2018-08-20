package com.plugin.gradle.lucio.dagger2.domain

import javax.inject.Inject

class StudentBean @Inject constructor(){
    var num: Int = 1
    var name: String = "赵四"
}