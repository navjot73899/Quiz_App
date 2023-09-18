package com.example.earningquizapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.earningquizapp.R
import com.example.earningquizapp.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
   val binding by lazy {
       FragmentProfileBinding.inflate(layoutInflater)
   }
    private var isExpand= true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.expanDconstraintLayout.visibility= View.GONE
        binding.clickImage.setOnClickListener {
            if (isExpand){
            binding.expanDconstraintLayout.visibility= View.VISIBLE
            binding.clickImage.setImageResource(R.drawable.arrowuppp)
           }
            else{
                binding.expanDconstraintLayout.visibility= View.GONE
                binding.clickImage.setImageResource(R.drawable.baseline_arrow_drop_down_24)


            }
            isExpand=!isExpand
        }



        return binding.root
    }

    companion object {


    }
}