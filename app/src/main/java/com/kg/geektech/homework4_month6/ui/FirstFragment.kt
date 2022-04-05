package com.kg.geektech.homework4_month6.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kg.geektech.homework4_month6.ViewModel
import com.kg.geektech.homework4_month6.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var model: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater)
        model = ViewModelProvider(requireActivity()).get(ViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnPlus.setOnClickListener {
                model.clickRise()
            }
            btnMinus.setOnClickListener {
                model.clickDecrease()
            }
        }
    }


}