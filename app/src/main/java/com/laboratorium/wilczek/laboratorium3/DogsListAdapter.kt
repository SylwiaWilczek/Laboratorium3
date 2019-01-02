package com.laboratorium.wilczek.laboratorium3

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*
import java.util.*

/**
 * Created by Sylwia on 1/6/2018.
 */

class DogsListAdapter(val dogs: ArrayList<String>, val listener: RecyclerViewClickListener) : RecyclerView.Adapter<DogsListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayoutView = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, null)
        return ViewHolder(itemLayoutView, listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setDogBreed(dogs[position])
    }

    override fun getItemCount(): Int {
        return dogs.size
    }

    inner class ViewHolder(itemView: View, private val listener: RecyclerViewClickListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        init {
            itemView.show_breed.setOnClickListener(this)
        }

        fun setDogBreed(dogBreed: String) {
            itemView.breed_tv.text = dogBreed
        }

        override fun onClick(view: View) {
            listener.onClick(view, adapterPosition, itemView.breed_tv.text.toString())
        }
    }
}
