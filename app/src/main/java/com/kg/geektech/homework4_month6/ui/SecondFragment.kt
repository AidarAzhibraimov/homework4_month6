package com.kg.geektech.homework4_month6.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kg.geektech.homework4_month6.ViewModel
import com.kg.geektech.homework4_month6.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var model: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        binding = FragmentSecondBinding.inflate(layoutInflater)
        model = ViewModelProvider(requireActivity())[ViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model.counterClick.observe(requireActivity()) {
            binding.apply {
                tvNumber.text = it.toString()
            }
        }
    }

}