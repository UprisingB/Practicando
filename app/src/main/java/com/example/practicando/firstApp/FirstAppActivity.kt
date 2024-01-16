package com.example.practicando.firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practicando.R
import com.example.practicando.firstApp.adapter.RegistroAdapter

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_registro)
        initRecyclerView()
    }
    fun    initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.ReciclerRegistro)
        recyclerView.layoutManager =LinearLayoutManager(this)

        recyclerView.adapter =RegistroAdapter(RegistroProvider.registroEmpleados)
    }
}