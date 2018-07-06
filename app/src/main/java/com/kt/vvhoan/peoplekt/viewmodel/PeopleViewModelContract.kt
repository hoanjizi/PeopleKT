package com.kt.vvhoan.peoplekt.viewmodel

import android.content.Context
import com.kt.vvhoan.peoplekt.model.People

interface PeopleViewModelContract {
    interface MainView{
        fun loadData(peoples : List<People>)
        fun getContext():Context
    }
    interface ViewModel{
        fun destroy()
    }
}