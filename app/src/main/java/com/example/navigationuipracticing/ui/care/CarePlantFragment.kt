package com.example.navigationuipracticing.ui.care

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.navigationuipracticing.databinding.FragmentCareBinding

class CarePlantFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel = ViewModelProvider(this).get(CarePlantViewModel::class.java)

        val binding = FragmentCareBinding.inflate(inflater, container, false)

        binding.lifecycleOwner = viewLifecycleOwner  // use Fragment.viewLifecycleOwner for fragments
        binding.careViewModel = viewModel
        binding.adapter = CarePlantAdapter(listOf())

        return binding.root
    }
}