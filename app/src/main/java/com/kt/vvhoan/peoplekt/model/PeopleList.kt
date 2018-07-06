package com.kt.vvhoan.peoplekt.model

import com.google.gson.annotations.SerializedName

data class PeopleList(@SerializedName("results")var results : List<People>)