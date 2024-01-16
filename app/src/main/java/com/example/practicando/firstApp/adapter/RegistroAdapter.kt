package com.example.practicando.firstApp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practicando.R
import com.example.practicando.firstApp.Registro

class RegistroAdapter(private val registroEmpleados:List<Registro>):RecyclerView.Adapter<RegistroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegistroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return RegistroViewHolder(layoutInflater.inflate(R.layout.item_registro,parent,false))
    }
    override fun getItemCount(): Int {
        return registroEmpleados.size
    }
    override fun onBindViewHolder(holder: RegistroViewHolder, position: Int) {
        val item= registroEmpleados[position]
        holder.render(item)


    }
}