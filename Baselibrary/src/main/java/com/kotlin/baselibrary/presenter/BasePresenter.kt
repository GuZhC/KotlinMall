package com.kotlin.baselibrary.presenter

import com.kotlin.baselibrary.presenter.view.BaseView

/**
 * Created by guZhongC on 2018/6/3.
 * describe:
 */

open class BasePresenter<T: BaseView>{
    lateinit var mView:T
}
