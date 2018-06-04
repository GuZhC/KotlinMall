package com.kotlin.user.service

import rx.Observable


/**
 * @author GuZhC
 * @create 2018/6/4
 * @Describe
 */
interface UserService {
    fun register(mobile:String,verifyCode:String,pwd:String): Observable<Boolean>
}