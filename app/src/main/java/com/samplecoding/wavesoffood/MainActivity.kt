package com.samplecoding.wavesoffood

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import com.samplecoding.wavesoffood.Fragment.HomeFragment
import com.samplecoding.wavesoffood.Fragment.CartFragment
import com.samplecoding.wavesoffood.Fragment.HistoryFragment
import com.samplecoding.wavesoffood.Fragment.ProfileFragment
import com.samplecoding.wavesoffood.Fragment.SearchFragment

import com.samplecoding.wavesoffood.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homefragmentbutton.setOnClickListener {
            replaceFragment(HomeFragment())
        }
        binding.cartfragmentbutton.setOnClickListener{
            replaceFragment(CartFragment())
        }
        binding.historyfragmentbutton.setOnClickListener{
            replaceFragment(HistoryFragment())
        }
        binding.profilefragmentbutton.setOnClickListener{
            replaceFragment(ProfileFragment())
        }
        binding.srachfragmentbutton.setOnClickListener{
            replaceFragment(SearchFragment())
        }


    }
    private fun replaceFragment(fragment:Fragment)
    {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()

    }
}