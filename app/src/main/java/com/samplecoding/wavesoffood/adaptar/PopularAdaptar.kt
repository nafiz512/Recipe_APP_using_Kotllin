package com.samplecoding.wavesoffood.adaptar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.samplecoding.wavesoffood.databinding.PopulerItemBinding

class PopularAdaptar( private val items:List<String>,private val price:List<String>,private val image:List<Int>): RecyclerView.Adapter<PopularAdaptar.PopularViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(PopulerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }



    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item = items[position]
        val images= image[position]
        val price = price[position]
        holder.bind(item,price,images)
    }
    override fun getItemCount(): Int {
        return items.size
    }

    class PopularViewHolder (private  val binding: PopulerItemBinding) : RecyclerView.ViewHolder(binding.root){
        private val imagesView= binding.imageView5
        fun bind(item: String,price:String, images: Int) {
            binding.foodNamePopuler.text=item
            binding.pricePopular.text= price
            imagesView.setImageResource(images)
        }

    }
}