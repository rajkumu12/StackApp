package com.decode.stackapp

import android.os.Bundle
import android.widget.StackView
import androidx.appcompat.app.AppCompatActivity
import com.decode.stackapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    private var imagelist = intArrayOf(
        R.drawable.picture_a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupStackView()
    }
    private fun setupStackView() {
        val adapter = StackAdapter(this, imagelist)
        binding.stackView.adapter = adapter
        adapter.notifyDataSetChanged()
    }

}