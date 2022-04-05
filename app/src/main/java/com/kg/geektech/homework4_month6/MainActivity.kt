package com.kg.geektech.homework4_month6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kg.geektech.homework4_month6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        adapter = Adapter(this)
        binding.apply {
            viewPager.adapter = adapter
        }
    }
}