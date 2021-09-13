package com.example.greenpath.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.greenpath.R
import com.example.greenpath.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    // This property is only valid between onCreateView and
    // onDestroyView.
   // private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)

        //val binding: ActivityMainBinding =
        //    DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


       val textHome: TextView = binding.textHome
        homeViewModel.textHome.observe(viewLifecycleOwner, Observer {
            textHome.text = it
        })



        return root
    }
}