package com.kotlin.user.presenter

import com.kotlin.baselibrary.ext.execute
import com.kotlin.baselibrary.presenter.BasePresenter
import com.kotlin.baselibrary.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.UserService
import com.kotlin.user.service.impl.UserServiceImpl
import javax.inject.Inject


/**
 * Created by guZhongC on 2018/6/3.
 *describe:
 */
class RegisterPresenter @Inject constructor()  : BasePresenter<RegisterView>()  {
    @Inject
    lateinit var userService:UserService
    fun register(mobile: String, verifyCode: String, pwd: String) {
        userService.register(mobile, verifyCode, pwd)
                .execute(object : BaseSubscriber<Boolean>() {
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })


    }
}

