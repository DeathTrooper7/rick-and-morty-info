package com.deathtrooper7.rickandmortyinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deathtrooper7.rickandmortyinfo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
