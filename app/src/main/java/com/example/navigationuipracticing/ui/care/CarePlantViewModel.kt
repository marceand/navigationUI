package com.example.navigationuipracticing.ui.care

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CarePlantViewModel : ViewModel() {

    private val _careList = MutableLiveData<List<CarePlant>>()
    val careList: LiveData<List<CarePlant>> = _careList

    init {
        val list = listOf<CarePlant>(CarePlant(ImageType.Indoor, "Indoor Houseplant Care Basics", "Monday, Oct 27", true),
            CarePlant(ImageType.Hoya,"Hoya Plant Care","Monday, Sep 17", true),
            CarePlant(ImageType.Best,"Best Times to Water", "Wednesday, Oct 12", false),
            CarePlant(ImageType.Best,"Best Times to Water", "Wednesday, Oct 12", false))
        _careList.value =list
    }
}