package com.example.earningquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewbinding.ViewBinding
import com.example.earningquizapp.Fragment.HomeFragment
import com.example.earningquizapp.databinding.ActivityHomeBinding
import com.example.earningquizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         binding= ActivityMainBinding.inflate(layoutInflater)
          setContentView(binding.root)


        binding.button.setOnClickListener {

            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)

        }
    }
}