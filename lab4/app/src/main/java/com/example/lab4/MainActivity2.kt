package com.example.lab4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val drink = findViewById<EditText>(R.id.ed_drink)
        val sugar = findViewById<RadioGroup>(R.id.radioGroup)
        val ice = findViewById<RadioGroup>(R.id.radioGroup2)
        findViewById<Button>(R.id.btn_send).setOnClickListener {
            val name = drink.text.toString().trim()
            if (name.isEmpty()) {
                drink.error = "請輸入飲料名稱"
                drink.requestFocus()
                return@setOnClickListener
            }
            val data = Intent().apply {
                putExtra("drink", name)
                putExtra("sugar", findViewById<RadioButton>(sugar.checkedRadioButtonId).text.toString())
                putExtra("ice", findViewById<RadioButton>(ice.checkedRadioButtonId).text.toString())
            }
            setResult(Activity.RESULT_OK, data)
            finish()
        }
    }
}
