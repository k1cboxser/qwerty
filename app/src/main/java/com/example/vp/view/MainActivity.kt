package com.example.vp.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.vp.databinding.ActivityMainBinding
import com.example.vp.present.CounterPresent

class MainActivity : AppCompatActivity(), MainActivityView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = CounterPresent()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        onClick()
    }

    override fun updateCounterView(model: Int) {
        binding.tvCounter.text = model.toString()

    }

    override fun setToast(count: Int) {
        if (count == 10) {
            Toast.makeText(this, "Поздровляем", Toast.LENGTH_LONG).show()
        }
    }

    override fun setColor(count: Int) {
        if (count == 15) {
            binding.tvCounter.setTextColor(Color.RED)
        } else {
            binding.tvCounter.setTextColor(Color.GRAY)
        }

    }

    private fun onClick() {
        binding.btnIncrement.setOnClickListener {
            presenter.increment()

        }

        binding.btnDecrement.setOnClickListener {
            presenter.decrement()
        }

    }
}
