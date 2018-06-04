package com.kotlin.user.data.repository

import com.kotlin.baselibrary.data.net.RetrofitFactory
import com.kotlin.baselibrary.data.protocol.BaseResp
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.RegisterReg
import rx.Observable
import javax.inject.Inject

/**
 * @author GuZhC
 * @create 2018/6/4
 * @Describe
 */
class  UserRepository  @Inject constructor(){
    fun register(mobile: String, pwd: String, verifyCode: String): Observable<BaseResp<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterReg(mobile,pwd,verifyCode))
    }
}