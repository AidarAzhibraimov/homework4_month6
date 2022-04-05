package com.kg.geektech.homework4_month6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

    private var counter = 0
    val counterClick = MutableLiveData<Int>()
    val counterClickHistory = MutableLiveData<String>()

    fun clickRise(){
        counter++
        counterClick.value = counter
        counterClickHistory.value = "+"
    }

    fun clickDecrease(){
        counter--
        counterClick.value = counter
        counterClickHistory.value = "-"
    }
}