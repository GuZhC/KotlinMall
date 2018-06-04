package com.kotlin.baselibrary.data.protocol

/**
 * @author GuZhC
 * @create 2018/6/4
 * @Describe
 */
class BaseResp<out T>(val status:Int, val message:String, val data:T)
