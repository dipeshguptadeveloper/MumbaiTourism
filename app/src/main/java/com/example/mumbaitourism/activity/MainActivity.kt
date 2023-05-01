package com.example.mumbaitourism.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mumbaitourism.activity.FamousPlacesToVisit.FamousFoodActivity
import com.example.mumbaitourism.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.cardViewFamousPlaces.setOnClickListener {
            startActivity(Intent(this@MainActivity, FamousPlacesActivity::class.java))
        }

        binding.cardViewFamousFood.setOnClickListener {
            startActivity(Intent(this@MainActivity, FamousFoodActivity::class.java))
        }

        binding.cardViewFamousHangoutPlaces.setOnClickListener {
            startActivity(Intent(this@MainActivity, FamousHangoutPlacesActivity::class.java))
        }
    }
}