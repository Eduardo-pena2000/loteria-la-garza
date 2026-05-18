package com.google.android.gms.internal.ads;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class o {
    public static /* bridge */ /* synthetic */ void a(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }
}
