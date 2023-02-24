package com.example.githubusersapp.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.githubusersapp.R
import com.example.githubusersapp.databinding.FragmentSplashBinding
import kotlinx.coroutines.delay

class SplashFragment : Fragment() {

    private lateinit var fragmentSplashBinding: FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        fragmentSplashBinding = FragmentSplashBinding.inflate(layoutInflater,container,false)
        return fragmentSplashBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showSplash()
    }

    private fun showSplash(){
        lifecycleScope.launchWhenStarted {
            delay(2000)
            findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
        }
    }
}