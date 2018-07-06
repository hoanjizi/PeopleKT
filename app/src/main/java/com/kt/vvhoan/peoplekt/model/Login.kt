package com.kt.vvhoan.peoplekt.model

import com.google.gson.annotations.SerializedName

data class Login(@SerializedName("uuid") var uuid : String,@SerializedName("username") var username:String,@SerializedName("password")var password :String)