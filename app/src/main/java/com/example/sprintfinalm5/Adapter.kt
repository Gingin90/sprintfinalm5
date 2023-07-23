package com.example.sprintfinalm5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sprintfinalm5.Adapter.ViewHolder
import com.example.sprintfinalm5.databinding.ItemBinding

class Adapter: RecyclerView.Adapter<ViewHolder>() {
    var zapatilla= mutableListOf<Zapatilla>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding= ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder (binding)
    }


    override fun getItemCount(): Int {
        return zapatilla.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = zapatilla[position]
        holder.bind(item)
    }
    fun setData(zapatilla: List<Zapatilla>) {
        this.zapatilla = zapatilla.toMutableList()
    }

    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(zapatilla:Zapatilla {
            binding.nombrePokem.text= pokemon.nombre
            binding.tipoPokemon.text= pokemon.tipo
            binding.imageViewPok.load(pokemon.imgUrl)
        }

    }
}



