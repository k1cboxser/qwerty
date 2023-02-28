package com.example.vp.model

import android.util.Log

class CounterModel {

     var countr = 0

    fun increment () {
        countr++
        Log.e("TAG", "$countr")
    }

    fun dicrement () {
        countr--
        Log.e("TAG", "$countr")
    }



}