package com.example.earningquizapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.earningquizapp.databinding.HistorylayoutBinding
import com.example.earningquizapp.model.history

class historyAdapter(var listHistory:ArrayList<history>):RecyclerView.Adapter<historyAdapter.historyViewholder>()  {
    class historyViewholder (var binding :HistorylayoutBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): historyViewholder {
        return historyViewholder(HistorylayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount()= listHistory.size

    override fun onBindViewHolder(holder: historyViewholder, position: Int) {
      var current= listHistory[position]
        holder.binding.time.text=current.timeAndDate
        holder.binding.coin1.text=current.coin
    }
}