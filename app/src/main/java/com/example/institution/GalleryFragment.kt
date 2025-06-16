package com.example.institution

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

private lateinit var webView: WebView
class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_gallery, container, false)
        webView=rootView.findViewById(R.id.webgallery)
        webView.loadUrl("https://namilyangocollege.education/gallery.php")
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        return rootView
    }
}