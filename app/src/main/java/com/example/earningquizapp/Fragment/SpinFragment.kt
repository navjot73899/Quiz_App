package com.example.earningquizapp.Fragment

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.earningquizapp.R
import com.example.earningquizapp.databinding.FragmentSpinBinding
import kotlin.random.Random


class SpinFragment : Fragment() {

    private lateinit var binding: FragmentSpinBinding
    private lateinit var countDown: CountDownTimer
    private var itemTitles= arrayOf("100","Try Again","500","Try Again","200","Try Again")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentSpinBinding.inflate(inflater,container, false)
        return binding.root
    }

    private fun showResult(itemTitle:String){
        Toast.makeText(requireContext(),itemTitle,Toast.LENGTH_SHORT).show()
    binding.spin.isEnabled= true}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.spin.setOnClickListener {
            binding.spin.isEnabled= false // button is disabled while spinning the wheel

            var spin =Random.nextInt(6)// create a random value between 0 to 6
            val degree= 60f * spin // calculate the rotation degree based on random value
            countDown= object : CountDownTimer(5000,50){
                var rotation= 0f
                override fun onTick(milisUntilFinished: Long) {
                   rotation +=5f
                    if(rotation>= degree){
                        rotation= degree
                        countDown.cancel()
                        showResult(itemTitles[spin])

                    }
                    binding.wheel.rotation=rotation
                }

                override fun onFinish() {}
            }.start()
        }
    }
}