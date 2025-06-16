package com.example.institution

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class HomeFragment : Fragment() {
   private lateinit var webView: WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment
        webView = rootView.findViewById(R.id.webhome)
        webView.loadUrl("https://namilyangocollege.education/index.php")
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        return rootView
    }
}