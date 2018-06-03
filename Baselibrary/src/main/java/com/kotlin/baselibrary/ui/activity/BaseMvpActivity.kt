package com.kotlin.baselibrary.ui.activity

import com.kotlin.baselibrary.presenter.BasePresenter
import com.kotlin.baselibrary.presenter.view.BaseView

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
    lateinit var mPresenter:T
}