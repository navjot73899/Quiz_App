package com.example.earningquizapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.earningquizapp.R
import com.example.earningquizapp.adapter.categoryAdapter
import com.example.earningquizapp.databinding.FragmentHomeBinding
import com.example.earningquizapp.model.Categorymodel

class HomeFragment : Fragment() {

   private  val binding:FragmentHomeBinding by lazy {
       FragmentHomeBinding.inflate(layoutInflater)
   }
    private val categoryList=ArrayList<Categorymodel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        categoryList.clear()
        categoryList.add(Categorymodel(R.drawable.englishs,"English"))
        categoryList.add(Categorymodel(R.drawable.mathmetic,"Mathematics"))
        categoryList.add(Categorymodel(R.drawable.scince,"Science"))
        categoryList.add(Categorymodel(R.drawable.historyimg,"History"))
        binding.recylcerView.layoutManager= GridLayoutManager(requireContext(),2)
        var adapter= categoryAdapter(categoryList)
        binding.recylcerView.adapter= adapter
        binding.recylcerView.setHasFixedSize(true)

    }


    companion object {

            }
}
