package com.unity3d.services.core.webview;

import android.webkit.ValueCallback;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ValueCallback c;

    public /* synthetic */ c(WebView webView, String str, ValueCallback valueCallback) {
        this.a = webView;
        this.b = str;
        this.c = valueCallback;
    }

    public final void run() {
        WebView.b(this.a, this.b, this.c);
    }
}
