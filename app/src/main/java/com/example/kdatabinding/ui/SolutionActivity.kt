package com.example.kdatabinding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.kdatabinding.R
import com.example.kdatabinding.data.SimpleViewModelSolution
import com.example.kdatabinding.databinding.SolutionBinding

class SolutionActivity : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModelSolution::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: SolutionBinding =
            DataBindingUtil.setContentView(this, R.layout.solution)

        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments

        binding.viewmodel = viewModel
    }
}