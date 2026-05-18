package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class p {
    public static /* bridge */ /* synthetic */ boolean a(WebViewClient webViewClient, WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
