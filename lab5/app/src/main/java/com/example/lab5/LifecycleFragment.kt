package com.example.lab5

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

open class LifecycleFragment : Fragment() {
    private fun record(event: String) {
        val host = activity as? MainActivity
        if (host != null) host.record(javaClass.simpleName, event)
        else Log.d("LifecycleLab", "${javaClass.simpleName}: $event")
    }
    override fun onAttach(context: Context) { super.onAttach(context); record("onAttach") }
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); record("onCreate") }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        record("onCreateView")
        return TextView(requireContext()).apply {
            text = "${this@LifecycleFragment.javaClass.simpleName}\n切換 Fragment、按返回、回主畫面或旋轉螢幕，觀察下方紀錄。"
            textSize = 20f
            setPadding(16, 16, 16, 16)
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { super.onViewCreated(view, savedInstanceState); record("onViewCreated") }
    override fun onStart() { super.onStart(); record("onStart") }
    override fun onResume() { super.onResume(); record("onResume") }
    override fun onPause() { record("onPause"); super.onPause() }
    override fun onStop() { record("onStop"); super.onStop() }
    override fun onDestroyView() { record("onDestroyView"); super.onDestroyView() }
    override fun onDestroy() { record("onDestroy"); super.onDestroy() }
    override fun onDetach() { record("onDetach"); super.onDetach() }
}
class FirstFragment : LifecycleFragment()
class SecondFragment : LifecycleFragment()
