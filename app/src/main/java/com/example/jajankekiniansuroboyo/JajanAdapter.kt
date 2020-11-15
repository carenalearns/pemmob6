package com.example.jajankekiniansuroboyo

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.jajan_list_item.view.*

class ContactAdapter (val jajanItemList: List<JajanData>, val clickListener: (JajanData) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.jajan_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(jajanItemList[position], clickListener)
    }

    override fun getItemCount() = jajanItemList.size
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(jajan: JajanData, clickListener: (JajanData) -> Unit) {
            itemView.image.setImageResource(jajan.imgj)
            itemView.tv_part_name.text = jajan.nama
            itemView.setOnClickListener { clickListener(jajan) }
        }
    }
}