package com.laboratorium.wilczek.laboratorium3

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Sylwia on 1/6/2018.
 */

class RandomDogResponse {
    @SerializedName("status")
    @Expose
    val status: String? = null
    @SerializedName("message")
    @Expose
    val message: String? = null
    var id: Int = 0
    var name: String? = null
}
