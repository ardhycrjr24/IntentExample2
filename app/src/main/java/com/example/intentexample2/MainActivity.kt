package com.example.intentexample2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.intentexample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        const val EXTRA_MESSAGE = "com.example.intentexample2.EXTRA_MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            val message = binding.etInput.text.toString().trim()
            if (message.isEmpty()) {
                Toast.makeText(this, "Masukkan teks dulu", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra(EXTRA_MESSAGE, message)
            startActivity(intent)
        }
    }
}
