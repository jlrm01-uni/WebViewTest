package com.example.webviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.webviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.webView.loadUrl("file:///android_asset/index.html")

        binding.button.setOnClickListener {
            binding.webView.loadUrl("https://google.com")
        }

        setContentView(binding.root)
    }
}