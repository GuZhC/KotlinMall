package com.kotlin.user.presenter

import com.kotlin.baselibrary.presenter.BasePresenter
import com.kotlin.user.presenter.view.RegisterView


/**
 * Created by guZhongC on 2018/6/3.
 *describe:
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile:String,verifyCode:String){

        mView.onRegisterResult(true)
    }
}