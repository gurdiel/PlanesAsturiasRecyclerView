package com.example.planesasturiasrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.planesasturiasrecyclerview.R
import com.example.planesasturiasrecyclerview.model.PlanAsturias

class RecyclerPlanesAdapter (val dataset: List<PlanAsturias>) :
    RecyclerView.Adapter<RecyclerPlanesAdapter.PlanesViewHolder>() {

    class PlanesViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imgPlan: ImageView = view.findViewById(R.id.imgPlan)
        val txtDescripcion: TextView = view.findViewById(R.id.txtdescripcion)

        fun bind(plan: PlanAsturias){
            imgPlan.setImageResource(plan.imgResourceId)
            txtDescripcion.setText(plan.descripcion)
        }

    }

    /**
     * Este método lo llama el RecycleView cuando crea los ViewHolder necesarios
     * los que caben más 3 o 4 más.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanesViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_plan_asturias, parent,false)

        return PlanesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: PlanesViewHolder, position: Int) {
        holder.bind(dataset[position])
    }

}