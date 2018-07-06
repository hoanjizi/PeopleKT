package com.kt.vvhoan.peoplekt.view

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.kt.vvhoan.peoplekt.R
import com.kt.vvhoan.peoplekt.databinding.ItemPeopleBinding
import com.kt.vvhoan.peoplekt.model.People
import com.kt.vvhoan.peoplekt.viewmodel.ItemPeopleViewModel
import java.util.*

class PeopleAdapter(var mPeopleList: List<People>):RecyclerView.Adapter<PeopleAdapter.PeopleAdapterViewHolder>(){
    init {
        mPeopleList = Collections.emptyList()
    }
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): PeopleAdapterViewHolder {
        var itemPeopleBinding : ItemPeopleBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_people,parent,false)
        return PeopleAdapterViewHolder(itemPeopleBinding)
    }

    override fun getItemCount(): Int =mPeopleList.size


    override fun onBindViewHolder(holder: PeopleAdapterViewHolder, position: Int) {
        holder.bindPeople(mPeopleList[position])
    }
    fun setPeopleList(peoples:List<People> )
    {
        mPeopleList = peoples
        notifyDataSetChanged()
    }

    class PeopleAdapterViewHolder(itemPeopleBinding: ItemPeopleBinding) : RecyclerView.ViewHolder(itemPeopleBinding.root) {
        private var mitem: ItemPeopleBinding? = null

        init {
            mitem = itemPeopleBinding
        }

        fun bindPeople(people: People) {
            if (mitem!!.itemPeopleViewModel == null) {
                mitem!!.itemPeopleViewModel = ItemPeopleViewModel(itemView.context, people)
            } else {
                mitem!!.itemPeopleViewModel!!.setPeople(people)
            }
//            mitem!!.itemPeopleViewModel?.setPeople(people)
//                    ?: ItemPeopleViewModel(itemView.context, people)
            mitem!!.executePendingBindings()
        }
    }
}