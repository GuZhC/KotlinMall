package com.kotlin.baselibrary.rx

import rx.Subscriber

/**
 * @author GuZhC
 * @create 2018/6/4
 * @Describe
 */
open class BaseSubscriber<T>: Subscriber<T>() {
    override fun onNext(t: T) {

    }

    override fun onError(e: Throwable?) {
    }

    override fun onCompleted() {

    }
}