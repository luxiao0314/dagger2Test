package com.plugin.gradle.lucio.dagger2.domain

import javax.inject.Inject

/**
 * @Description
 * @Author sean
 * @Email xiao.lu@magicwindow.cn
 * @Date 20/08/2018 5:58 PM
 * @Version
 */
class TeacherBean @Inject constructor(var studentBean: StudentBean)