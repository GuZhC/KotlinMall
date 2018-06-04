package com.kotlin.baselibrary.ext

import com.kotlin.baselibrary.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * @author GuZhC
 * @create 2018/6/4
 * @Describe
 */
fun <T> Observable<T>.execute(subscriber:BaseSubscriber<T>){
    this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}