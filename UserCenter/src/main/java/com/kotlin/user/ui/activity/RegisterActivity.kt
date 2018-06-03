package com.kotlin.user.ui.activity

import android.os.Bundle
import com.kotlin.baselibrary.ui.activity.BaseMvpActivity
import com.kotlin.user.R
import com.kotlin.user.presenter.RegisterPresenter
import com.kotlin.user.presenter.view.RegisterView

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this
    }

    override fun onRegisterResult(result: Boolean) {

    }
}
