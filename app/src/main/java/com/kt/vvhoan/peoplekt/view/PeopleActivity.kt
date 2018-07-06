package com.kt.vvhoan.peoplekt.view

import android.content.Context
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.kt.vvhoan.peoplekt.R
import com.kt.vvhoan.peoplekt.databinding.ActivityPeopleBinding
import com.kt.vvhoan.peoplekt.model.People
import com.kt.vvhoan.peoplekt.viewmodel.PeopleViewModel
import com.kt.vvhoan.peoplekt.viewmodel.PeopleViewModelContract
import java.util.*

@Suppress("CAST_NEVER_SUCCEEDS")
class PeopleActivity : AppCompatActivity(), PeopleViewModelContract.MainView {
    override fun loadData(peoples: List<People>) {
        val peopleAdapter: PeopleAdapter = mBinding!!.listpeople.adapter as PeopleAdapter
        peopleAdapter.setPeopleList(peoples)
    }

    override fun getContext(): Context {
        return this@PeopleActivity
    }

    private var mBinding: ActivityPeopleBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val peopleAdapter = PeopleAdapter(Collections.emptyList())
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_people)
        mBinding!!.listpeople.adapter = peopleAdapter
        mBinding!!.listpeople.layoutManager = LinearLayoutManager(this)
       val viewModel= PeopleViewModel(this@PeopleActivity,this.getContext())
        //mBinding!!.people = viewModel
        mBinding!!.fab.setOnClickListener {viewModel.onClickFab()}

    }
}