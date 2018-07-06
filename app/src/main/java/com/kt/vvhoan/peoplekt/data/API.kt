package com.kt.vvhoan.peoplekt.data

import com.kt.vvhoan.peoplekt.model.PeopleList
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("/")
    fun getPeopleApi(@Query("results")number : Int,@Query("nat")location:String) : Observable<PeopleList>
}