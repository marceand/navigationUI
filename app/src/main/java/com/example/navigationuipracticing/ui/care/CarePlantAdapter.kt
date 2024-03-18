package com.example.navigationuipracticing.ui.care

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationuipracticing.databinding.ItemPlantCareBinding

class CarePlantAdapter(var dataSet: List<CarePlant>) :
    RecyclerView.Adapter<CarePlantAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPlantCareBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int= dataSet.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    fun updateData(carePlants: List<CarePlant>) {
        this.dataSet = carePlants
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemPlantCareBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CarePlant) {
            binding.plantCare = item
            binding.executePendingBindings()
        }
    }
}