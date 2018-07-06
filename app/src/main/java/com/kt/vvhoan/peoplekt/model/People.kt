package com.kt.vvhoan.peoplekt.model

import com.google.gson.annotations.SerializedName

data class People(@SerializedName("location") var location : Location,@SerializedName("login")var login :Login,@SerializedName("picture")var picture : Picture,var fullLocation : String,var fullLogin:String,var fullImg : String)