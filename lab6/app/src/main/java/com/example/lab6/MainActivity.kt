package com.example.lab6

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("請選擇功能")
                .setMessage("請根據按鈕選擇要顯示的物件")
                .setNeutralButton("取消") { _, _ -> Toast.makeText(this, "dialog", Toast.LENGTH_SHORT).show() }
                .setNegativeButton("自定義Toast") { _, _ -> showCustomToast() }
                .setPositiveButton("顯示LIST") { _, _ -> showListDialog() }
                .show()
        }
    }
    @Suppress("DEPRECATION")
    private fun showCustomToast() {
        // 作業示範自訂 Toast；在前景 Activity 中顯示。
        Toast(this).apply {
            duration = Toast.LENGTH_SHORT
            view = layoutInflater.inflate(R.layout.custom_toast, null)
            setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, (50 * resources.displayMetrics.density).toInt())
        }.show()
    }
    private fun showListDialog() {
        val messages = arrayOf("message1", "message2", "message3", "message4", "message5")
        AlertDialog.Builder(this)
            .setTitle("使用LIST呈現")
            .setItems(messages) { _, index ->
                Toast.makeText(this, "你選擇的是${messages[index]}", Toast.LENGTH_SHORT).show()
            }.show()
    }
}
