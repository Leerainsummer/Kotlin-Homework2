package com.example.lab4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var meal: TextView
    private val orderLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            result.data?.let { data ->
                meal.text = "飲料：${data.getStringExtra("drink")}\n\n甜度：${data.getStringExtra("sugar")}\n\n冰塊：${data.getStringExtra("ice")}"
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        meal = findViewById(R.id.tv_meal)
        savedInstanceState?.getString("meal")?.let { meal.text = it }
        findViewById<Button>(R.id.btn_choice).setOnClickListener {
            orderLauncher.launch(Intent(this, MainActivity2::class.java))
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("meal", meal.text.toString())
        super.onSaveInstanceState(outState)
    }
}
