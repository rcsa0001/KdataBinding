package com.example.kdatabinding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.kdatabinding.R
import com.example.kdatabinding.data.SimpleViewModelSolution
import com.example.kdatabinding.databinding.PlainActivitySolution4Binding

class PlainOldActivitySolution4 : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModelSolution::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: PlainActivitySolution4Binding =
            DataBindingUtil.setContentView(this, R.layout.plain_activity_solution_4)

        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments

        binding.viewmodel = viewModel
    }
}