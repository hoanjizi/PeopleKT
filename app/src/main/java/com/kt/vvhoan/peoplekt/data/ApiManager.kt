package com.kt.vvhoan.peoplekt.data

import com.kt.vvhoan.peoplekt.model.PeopleList
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object ApiManager {
    private val baseurl : String = "https://api.randomuser.me"
    fun getAPi():API? {
        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl).build()
        return retrofit.create(API::class.java)
    }
    fun getPeople(number:Int,location:String) :Observable<PeopleList> {
        return getAPi()!!.getPeopleApi(number,location)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}