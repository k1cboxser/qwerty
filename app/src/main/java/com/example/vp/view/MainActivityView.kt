package com.example.vp.view

interface MainActivityView {
    fun updateCounterView(model: Int)
    fun setToast(count:Int)
    fun setColor(count:Int)
}