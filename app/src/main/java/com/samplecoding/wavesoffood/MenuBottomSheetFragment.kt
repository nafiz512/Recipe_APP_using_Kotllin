package com.samplecoding.wavesoffood

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.samplecoding.wavesoffood.adaptar.MenuAdapter
import com.samplecoding.wavesoffood.databinding.FragmentMenuBottomSheetBinding


class MenuBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentMenuBottomSheetBinding.inflate(inflater,container,false)

        val menuFoodName=listOf("Burger","sandwich","momo","pizza","Burger","sandwich","momo","pizza")
        val menuItemPrice= listOf("$5","$6","$8","$9","$5","$6","$8","$9")
        val menuImage= listOf(
            R.drawable.m1,
            R.drawable.m2,
            R.drawable.m6,
            R.drawable.m3,
            R.drawable.m4,
            R.drawable.m5,
            R.drawable.m6,
            R.drawable.m3
        )
        val adapter= MenuAdapter(
            ArrayList(menuFoodName),
            ArrayList(menuItemPrice),
            ArrayList(menuImage),requireContext()
        )
        binding.menuRecyclerView.layoutManager= LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter=adapter
        return binding.root
    }

    companion object {

    }
}