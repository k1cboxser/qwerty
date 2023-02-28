package com.example.vp.present

import com.example.vp.model.CounterModel
import com.example.vp.view.MainActivityView

class CounterPresent {

    private lateinit var view: MainActivityView
    private val counterModel = CounterModel()


    fun increment() {
        counterModel.increment()
        view.updateCounterView(counterModel.countr)
        view.setToast(counterModel.countr)
        view.setColor(counterModel.countr)
    }

    fun decrement() {
        counterModel.dicrement()
        view.updateCounterView(counterModel.countr)
        view.setToast(counterModel.countr)
        view.setColor(counterModel.countr)
    }

    fun attachView(view: MainActivityView) {
        this.view = view
    }
}