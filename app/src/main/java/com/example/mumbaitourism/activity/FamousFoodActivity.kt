package com.example.mumbaitourism.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mumbaitourism.R
import com.example.mumbaitourism.databinding.ActivityFamousFoodBinding

class FamousFoodActivity : AppCompatActivity() {

    lateinit var binding: ActivityFamousFoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFamousFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}