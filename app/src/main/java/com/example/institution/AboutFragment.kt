package com.example.institution

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class AboutFragment : Fragment() {
private lateinit var webView: WebView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_about,container,false)
        webView = rootView.findViewById(R.id.webabout)
        webView.loadUrl("https://namilyangocollege.education/aboutcollege.php")
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        return rootView
    }
}