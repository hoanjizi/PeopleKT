package com.kt.vvhoan.peoplekt.model

import com.google.gson.annotations.SerializedName

data class Location(@SerializedName("street") var street : String,@SerializedName("city") var city : String,
                    @SerializedName("state")var state : String,@SerializedName("postcode") var postcode : String)