package com.kt.vvhoan.peoplekt.viewmodel

import android.content.Context
import android.databinding.ObservableInt
import com.kt.vvhoan.peoplekt.model.onclick

class PeopleViewModel(mainview: PeopleViewModelContract.MainView, val context: Context) : PeopleViewModelContract.ViewModel {
    private var main: PeopleViewModelContract.MainView? = null
    private var cont: Context? = null
    val obj : ObservableInt? = null

    init {
        main = mainview
        cont = context
    }

    override fun destroy() {

    }

    fun onClickFab() {
        onclick(main)
        //MutableList<String>.test()
    }

}