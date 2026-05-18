package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbpp implements P5.b {
    private final /* synthetic */ WebView zza;

    public /* synthetic */ zzbpp(WebView webView) {
        this.zza = webView;
    }

    public final /* synthetic */ void onH5AdsEvent(String str) {
        int i = zzbpq.zza;
        this.zza.evaluateJavascript(str, (ValueCallback) null);
    }
}
