package com.example.latihan_databindingrecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan_databindingrecycleview.databinding.ItemProductBinding

class BeritaAdapter(var listBerita : ArrayList<ListBerita>):
    RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    var onClick:((ListBerita)->Unit)? =null

    class ViewHolder(val binding:ItemProductBinding):RecyclerView.ViewHolder(binding.root) {

        fun bindProduct(itemData:ListBerita){
            binding.berita = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaAdapter.ViewHolder {
        var view = ItemProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeritaAdapter.ViewHolder, position: Int) {
        var dataProduct = listBerita[position]
        holder.bindProduct(listBerita[position])
        holder.binding.cardView.setOnClickListener {
            onClick?.invoke(listBerita[position])
        }

    }

    override fun getItemCount(): Int {
        return listBerita.size
    }
}