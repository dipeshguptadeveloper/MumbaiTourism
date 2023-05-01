package com.example.mumbaitourism.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mumbaitourism.activity.FamousPlacesToVisit.FamousPlaceCMSTActivity
import com.example.mumbaitourism.activity.FamousPlacesToVisit.FamousPlaceCSMTVSActivity
import com.example.mumbaitourism.activity.FamousPlacesToVisit.FamousPlaceGVPActivity
import com.example.mumbaitourism.activity.FamousPlacesToVisit.FamousPlaceGatewayOfIndiaActivity
import com.example.mumbaitourism.activity.FamousPlacesToVisit.FamousPlaceSGNPActivity
import com.example.mumbaitourism.activity.FamousPlacesToVisit.FamousPlaceSVTempleActivity
import com.example.mumbaitourism.activity.FamousPlacesToVisit.FamousPlacesKCActivity
import com.example.mumbaitourism.databinding.ActivityFamousPlacesBinding

class FamousPlacesActivity : AppCompatActivity() {

    lateinit var binding: ActivityFamousPlacesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFamousPlacesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardViewGateway.setOnClickListener {
            startActivity(
                Intent(
                    this@FamousPlacesActivity,
                    FamousPlaceGatewayOfIndiaActivity::class.java
                )
            )
        }

        binding.cardViewSVTemple.setOnClickListener {
            startActivity(
                Intent(
                    this@FamousPlacesActivity,
                    FamousPlaceSVTempleActivity::class.java
                )
            )
        }

        binding.cardViewCSMT.setOnClickListener {
            startActivity(
                Intent(
                    this@FamousPlacesActivity,
                    FamousPlaceCMSTActivity::class.java
                )
            )
        }

        binding.cardViewSGNP.setOnClickListener {
            startActivity(
                Intent(
                    this@FamousPlacesActivity,
                    FamousPlaceSGNPActivity::class.java
                )
            )
        }

        binding.cardViewGVP.setOnClickListener {
            startActivity(
                Intent(
                    this@FamousPlacesActivity,
                    FamousPlaceGVPActivity::class.java
                )
            )
        }

        binding.cardViewCSMTVS.setOnClickListener {
            startActivity(
                Intent(
                    this@FamousPlacesActivity,
                    FamousPlaceCSMTVSActivity::class.java
                )
            )
        }

        binding.cardViewKC.setOnClickListener {
            startActivity(
                Intent(
                    this@FamousPlacesActivity,
                    FamousPlacesKCActivity::class.java
                )
            )
        }
    }
}