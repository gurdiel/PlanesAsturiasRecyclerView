package com.example.planesasturiasrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.planesasturiasrecyclerview.adapter.RecyclerPlanesAdapter
import com.example.planesasturiasrecyclerview.data.DataSource
import com.example.planesasturiasrecyclerview.model.PlanAsturias


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.planesRecyclerView)
        recycler.adapter = RecyclerPlanesAdapter(DataSource.listaPlanes)

    }

}