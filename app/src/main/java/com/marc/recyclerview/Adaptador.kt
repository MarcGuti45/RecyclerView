package com.marc.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.marc.recyclerview.R

class Adaptador(val listaPersona: List<Objecte>): RecyclerView.Adapter<Adaptador.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adaptador.ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_persona, parent, false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: Adaptador.ViewHolder, position: Int) {
        val equipo = listaPersona[position]

        holder.nom.text = equipo.nombre
        holder.dni.text = equipo.dni
        holder.tel.text = equipo.tlf.toString()
    }

    override fun getItemCount(): Int {
        return listaPersona.size
    }

    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val nom: TextView = itemView.findViewById(R.id.nom)
        val dni: TextView = itemView.findViewById(R.id.dni)
        val tel: TextView = itemView.findViewById(R.id.tel)
    }
}