package com.example.earningquizapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.earningquizapp.R
import com.example.earningquizapp.adapter.historyAdapter
import com.example.earningquizapp.databinding.FragmentHistoryBinding
import com.example.earningquizapp.model.history

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class HistoryFragment : Fragment() {
   val binding by lazy {
       FragmentHistoryBinding.inflate(layoutInflater)
   }
    private var listHistory= ArrayList<history>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       listHistory.add(history("12.30", "300"))
        listHistory.add(history("14.30", "100"))
        listHistory.add(history("18.50", "400"))
        listHistory.add(history("19.40", "500"))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding.REcyleviewHistory.layoutManager= LinearLayoutManager(requireContext())
       var adapter= historyAdapter(listHistory)
        binding.REcyleviewHistory.adapter= adapter
        binding.REcyleviewHistory.setHasFixedSize(true)
        return binding.root

    }

    companion object {


    }
}