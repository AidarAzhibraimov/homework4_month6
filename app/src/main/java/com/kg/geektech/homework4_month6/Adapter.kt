package com.kg.geektech.homework4_month6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kg.geektech.homework4_month6.ui.FirstFragment
import com.kg.geektech.homework4_month6.ui.SecondFragment
import com.kg.geektech.homework4_month6.ui.ThirdFragment

class Adapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FirstFragment()
            }
            1 -> {
                SecondFragment()
            }
            2 -> {
                ThirdFragment()
            }
            else -> {
                FirstFragment()
            }
        }
    }
}