package com.example.githubusersapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.githubusersapp.R
import com.example.githubusersapp.databinding.ActivityMainBinding
import com.example.githubusersapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var fragmentMainBinding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        fragmentMainBinding = FragmentMainBinding.inflate(layoutInflater,container,false)
        return fragmentMainBinding.root
    }
}