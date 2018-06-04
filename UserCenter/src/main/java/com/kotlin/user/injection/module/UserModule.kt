package com.kotlin.user.injection.module

import com.kotlin.user.service.UserService
import com.kotlin.user.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * @author GuZhC
 * @create 2018/6/4
 * @Describe
 */
@Module
class UserModule {

    @Provides
    fun providesUserService(service:UserServiceImpl):UserService{
        return service
    }
}