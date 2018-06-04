package com.kotlin.user.data.api

import com.kotlin.baselibrary.data.protocol.BaseResp
import com.kotlin.user.data.protocol.RegisterReg
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * @author GuZhC
 * @create 2018/6/4
 * @Describe
 */
interface UserApi {
    @POST("userCenter/register")
    fun register(@Body req: RegisterReg): Observable<BaseResp<String>>
}