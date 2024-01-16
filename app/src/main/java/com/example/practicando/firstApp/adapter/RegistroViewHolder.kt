package com.example.practicando.firstApp.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.practicando.R
import com.example.practicando.firstApp.Registro

class RegistroViewHolder (view: View):RecyclerView.ViewHolder(view){
    val id= view.findViewById<TextView>(R.id.name)
    val name= view.findViewById<TextView>(R.id.apellido)
    val status= view.findViewById<TextView>(R.id.status)
    fun render(RegistroModel: Registro){
        id.text= RegistroModel.id.toString()
        name.text=RegistroModel.name
        status.text=RegistroModel.status.toString()

    }
}