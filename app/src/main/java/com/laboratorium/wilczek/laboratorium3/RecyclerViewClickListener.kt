package com.laboratorium.wilczek.laboratorium3

import android.view.View

/**
 * Created by Sylwia on 1/6/2018.
 */

interface RecyclerViewClickListener {
    fun onClick(view: View, position: Int, name: String)
}
