package com.samplecoding.wavesoffood.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.samplecoding.wavesoffood.R
import com.samplecoding.wavesoffood.databinding.FragmentHomeBinding
import com.samplecoding.wavesoffood.adaptar.PopularAdaptar
import androidx.recyclerview.widget.LinearLayoutManager
import com.samplecoding.wavesoffood.MenuBottomSheetFragment

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewAllMenu.setOnClickListener {
            val bottomSheetDialog = MenuBottomSheetFragment()
            bottomSheetDialog.show(parentFragmentManager, "Test")
        }
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.m1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.m2, ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemPosition = imageList[position]
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(), itemMessage, Toast.LENGTH_SHORT).show()
            }
        })
        val foodName= listOf("Burger","sandwich","momo","pizza","Burger","sandwich","momo","pizza")
        val Price= listOf("$5","$6","$8","$9","$5","$6","$8","$9")
        val PopulerFoodImages= listOf(R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4,R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4)
        val adapter=PopularAdaptar(foodName,Price,PopulerFoodImages)
        binding.populerRecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.populerRecyclerView.adapter=adapter
    }

    companion object {

    }
}