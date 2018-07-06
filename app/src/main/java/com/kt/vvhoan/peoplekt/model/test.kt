package com.kt.vvhoan.peoplekt.model

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.kt.vvhoan.peoplekt.data.ApiManager
import com.kt.vvhoan.peoplekt.viewmodel.PeopleViewModelContract
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

fun onclick(main: PeopleViewModelContract.MainView?)
{
    ApiManager.getPeople(10, "en").subscribe(object : Observer<PeopleList> {
        override fun onComplete() {

        }

        override fun onSubscribe(d: Disposable) {
        }

        override fun onNext(t: PeopleList) {
            main!!.loadData(t.results)
        }

        override fun onError(e: Throwable) {
            Log.e("error ob", e.toString())
        }

    })
}
fun MutableList<String>.test(string: String)
{

}
class test : ViewModel() {
    private lateinit var users : MutableLiveData<List<PeopleList>>
}