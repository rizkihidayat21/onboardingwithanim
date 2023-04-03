package com.example.isekai

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.isekai.databinding.FragmentOnBoardingBinding
import com.example.isekai.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {


    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSplashBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        Handler(Looper.getMainLooper()).postDelayed({

            if (onBoardingIsFinished()){
                findNavController().navigate(R.id.navigate_splashFragment_to_homeFragment)
            }else{
                findNavController().navigate(R.id.action_splashFragment_to_onBoardingFragment)
            }

        }, 3000)

        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        return binding.root
    }


    private fun onBoardingIsFinished(): Boolean{

        val sharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("finished",false)
    }
}