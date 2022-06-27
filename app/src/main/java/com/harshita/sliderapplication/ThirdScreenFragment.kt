package com.harshita.sliderapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.harshita.sliderapplication.databinding.FragmentThirdScreenBinding

class ThirdScreenFragment : Fragment() {
    private var _binding: FragmentThirdScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdScreenBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.finish.setOnClickListener {
            activity?.finish()
            startActivity(Intent(context, HomeActivity::class.java))

        }

        return view
    }


}