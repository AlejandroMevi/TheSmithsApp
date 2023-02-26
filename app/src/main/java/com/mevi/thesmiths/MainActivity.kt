package com.mevi.thesmiths

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.mevi.thesmiths.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        Log.d("On Create", "Activity Main")
        initialization()
        setContentView(binding.root)
    }
    private fun initialization() {
        with(binding){
            Button.setOnClickListener {
                Toast.makeText(this@MainActivity, "C. Tangana es reggeaton", Toast.LENGTH_SHORT).show()
                println("Es la velda")
                Button.setBackgroundResource(R.color.black)
                Button.text = "Dejame en Paz"
            }
        }
    }
}