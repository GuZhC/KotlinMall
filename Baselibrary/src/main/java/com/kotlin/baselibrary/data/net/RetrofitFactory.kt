package com.kotlin.baselibrary.data.net

import com.kotlin.baselibrary.common.BaseConstant
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author GuZhC
 * @create 2018/6/4
 * @Describe
 */

class RetrofitFactory private constructor() {
    companion object {
         val instance: RetrofitFactory by lazy { RetrofitFactory() }
    }

    private val interceptor:Interceptor
    private val retrofit: Retrofit

    init {
        interceptor = Interceptor {
            chain ->
            val repuest = chain.request()
                    .newBuilder()
                    .header("Content-Type","application/json")
                    .addHeader("charset","utf-8")
                    .build()
            chain.proceed(repuest)

        }
        retrofit = Retrofit.Builder()
                .baseUrl(BaseConstant.SERVER_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(initClient())
                .build()
    }

    private fun initClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .addInterceptor(initLogInterceptor())
                .connectTimeout(10,TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .build()
    }

    private fun initLogInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    fun <T>create(service:Class<T>):T{
        return retrofit.create(service)
    }
}