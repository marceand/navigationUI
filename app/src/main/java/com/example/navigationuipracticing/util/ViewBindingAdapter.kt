package com.example.navigationuipracticing.util

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationuipracticing.R
import com.example.navigationuipracticing.ui.care.CarePlant
import com.example.navigationuipracticing.ui.care.CarePlantAdapter
import com.example.navigationuipracticing.ui.care.ImageType
import com.squareup.picasso.Picasso


@BindingAdapter("app:setAdapter")
fun setAdapter(recyclerView: RecyclerView, adapter: CarePlantAdapter?){
    adapter?.let { recyclerView.adapter = it }
}

@BindingAdapter("app:submitList")
fun submitList(recyclerView: RecyclerView, dataSet: List<CarePlant>?){
    val adapter = recyclerView.adapter as CarePlantAdapter?
    adapter?.updateData(dataSet ?: listOf())
}
@BindingAdapter("app:setImage")
fun setImage(imageView: ImageView, imageType: ImageType){
    when(imageType){
        ImageType.Indoor -> Picasso.get().load(R.drawable.indoor_plant).into(imageView)
        ImageType.Hoya -> Picasso.get().load(R.drawable.hoya_plant).into(imageView)
        ImageType.Best -> Picasso.get().load(R.drawable.best_plant).into(imageView)
    }
}

@BindingAdapter("app:setNewVisibility")
fun setNewVisibility(textView: TextView, isNew: Boolean){
    textView.visibility = if (isNew) View.VISIBLE else View.GONE
}