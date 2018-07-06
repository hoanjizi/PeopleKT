package com.kt.vvhoan.peoplekt.viewmodel

import android.content.Context
import android.databinding.BaseObservable
import com.kt.vvhoan.peoplekt.model.People

class ItemPeopleViewModel(context: Context,people: People) : BaseObservable() {
    private var mPeople : People? = null
    private var context : Context? = null
    init {
        mPeople = people
        this.context = context
    }
    fun getLocation() : String
    {
        mPeople!!.fullLocation = mPeople!!.location.city+"::"+mPeople!!.location.street
        return mPeople!!.fullLocation
    }
    fun getLogin() : String
    {
        mPeople!!.fullLogin = mPeople!!.login.username+"::"+mPeople!!.login.password
        return mPeople!!.fullLogin
    }
    fun getPicture():String
    {
        mPeople!!.fullImg = mPeople!!.picture.medium
        return mPeople!!.fullImg
    }
    fun setPeople(people: People)
    {
        mPeople = people
    }
}