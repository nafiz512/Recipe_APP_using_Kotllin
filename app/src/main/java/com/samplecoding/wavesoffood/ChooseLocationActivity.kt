package com.samplecoding.wavesoffood

import android.os.Bundle
import android.widget.ArrayAdapter // Import ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.samplecoding.wavesoffood.databinding.ActivityChooseLocationBinding

class ChooseLocationActivity : AppCompatActivity() {
    private val binding: ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val locationList = arrayOf("Dhaka", "Comilla", "Rajshahi", "Barishal", "Sylhet")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, locationList)

        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)

        // Optional: Handle item selection
        autoCompleteTextView.setOnItemClickListener { parent, view, position, id ->
            val selectedLocation = parent.getItemAtPosition(position).toString()
            // Do something with the selected location, e.g., save it or display it
            // Log.d("SelectedLocation", selectedLocation)
        }
    }
}