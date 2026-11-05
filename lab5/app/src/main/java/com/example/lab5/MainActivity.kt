package com.example.lab5

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var events: TextView
    private val history = StringBuilder()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        events = findViewById(R.id.events)
        history.append(savedInstanceState?.getString("history").orEmpty())
        record("Activity", "onCreate")
        findViewById<Button>(R.id.first).setOnClickListener { showFragment("FirstFragment") }
        findViewById<Button>(R.id.second).setOnClickListener { showFragment("SecondFragment") }
        findViewById<Button>(R.id.clear).setOnClickListener { history.clear(); events.text = "" }
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FirstFragment()).commit()
        }
    }
    private fun showFragment(name: String) {
        if (supportFragmentManager.findFragmentById(R.id.container)?.javaClass?.simpleName == name) return
        val fragment = if (name == "FirstFragment") FirstFragment() else SecondFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment)
            .addToBackStack(name).commit()
    }
    fun record(owner: String, event: String) {
        Log.d("LifecycleLab", "$owner: $event")
        history.append("$owner: $event\n")
        if (::events.isInitialized) events.text = history.toString()
    }
    override fun onStart() { super.onStart(); record("Activity", "onStart") }
    override fun onResume() { super.onResume(); record("Activity", "onResume") }
    override fun onPause() { record("Activity", "onPause"); super.onPause() }
    override fun onStop() { record("Activity", "onStop"); super.onStop() }
    override fun onRestart() { super.onRestart(); record("Activity", "onRestart") }
    override fun onDestroy() { record("Activity", "onDestroy"); super.onDestroy() }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("history", history.toString())
        super.onSaveInstanceState(outState)
    }
}
