package com.leojoestrela.jboard.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationBarView
import com.leojoestrela.jboard.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {

                    true
                }

                R.id.history -> {

                    true
                }

                else -> false
            }

        }
    }

}