package com.kotlin.baselibrary.injection.component

import android.app.Activity
import com.kotlin.base.injection.ActivityScope
import com.kotlin.base.injection.module.ActivityModule
import dagger.Component

/**
 * @author GuZhC
 * @create 2018/6/4
 * @Describe
 */
@ActivityScope
@Component(dependencies =arrayOf(AppComponent::class) ,
        modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun activity(): Activity
}