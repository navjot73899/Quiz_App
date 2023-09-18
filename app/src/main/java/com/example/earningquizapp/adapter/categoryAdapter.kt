package com.example.earningquizapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.earningquizapp.databinding.CategoryitemsBinding
import com.example.earningquizapp.model.Categorymodel

class categoryAdapter(var categoryList:ArrayList<Categorymodel>) : RecyclerView.Adapter<categoryAdapter.categoryviewHolder> (){
    class categoryviewHolder(var binding:CategoryitemsBinding) :RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): categoryviewHolder {
       return categoryviewHolder(CategoryitemsBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount()= categoryList.size

    override fun onBindViewHolder(holder: categoryviewHolder, position: Int) {
       var current= categoryList[position]
        holder.binding.categoryImage.setImageResource(current.image)
        holder.binding.categoryText.text=current.name
    }
}