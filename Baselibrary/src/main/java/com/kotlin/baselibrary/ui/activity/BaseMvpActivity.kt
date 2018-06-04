package com.kotlin.baselibrary.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import com.kotlin.base.common.BaseApplication
import com.kotlin.base.injection.module.ActivityModule
import com.kotlin.baselibrary.injection.component.ActivityComponent
import com.kotlin.baselibrary.injection.component.DaggerActivityComponent
import com.kotlin.baselibrary.presenter.BasePresenter
import com.kotlin.baselibrary.presenter.view.BaseView
import javax.inject.Inject

/**
 * Created by guZhongC on 2018/6/3.
 *describe:
 */
open class BaseMvpActivity<T: BasePresenter<*>> : BaseActivity(),BaseView {
    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun onError() {
    }
    @Inject
    lateinit var mPresenter:T

    lateinit var activityComponent:ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        initActivityInjection()
    }

    private fun initActivityInjection(){
        activityComponent = DaggerActivityComponent.builder().appComponent((application as BaseApplication).
                appComponent).activityModule(ActivityModule(this)).build()
    }
}