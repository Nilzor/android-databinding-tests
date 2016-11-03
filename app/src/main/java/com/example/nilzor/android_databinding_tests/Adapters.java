package com.example.nilzor.android_databinding_tests;

import android.databinding.BindingAdapter;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class Adapters {
    @BindingAdapter("app:attachedProgressBar")
    public static void setAttachedProgressBar(WebView webView, ProgressBar progBar) {
        android.util.Log.d("", "Attached: " + progBar);
    }
}
