package com.example.rv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterOne (private val names: List<String>) : RecyclerView
.Adapter<AdapterOne.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val largeTextView: TextView = itemView.findViewById(R.id.tvItemOne_1)
        val smallTextView: TextView = itemView.findViewById(R.id.tvItemOne_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }

    // !!! САМОЕ ВАЖНОЕ !!!
    //СВЯЗЫВАЕМ ТЕКСТОВЫЕ МЕТКИ С ДАННЫМИ
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        // тут можно по разному прикрепять данные, но мы будем
        // в одном случае передавать данные из списка, а во втором - просто песатаь одно и то же слово
        holder.largeTextView.text = names[position]
        holder.smallTextView.text = "кот"
    }
    // !!! САМОЕ ВАЖНОЕ !!!

    override fun getItemCount() = names.size
}




