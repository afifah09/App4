package com.example.app4

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val SharedPrefFile = "kotlinesharedpredpreference"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences : SharedPreferences = this.getSharedPreferences(SharedPrefFile, MODE_PRIVATE)

        bin
    }
}