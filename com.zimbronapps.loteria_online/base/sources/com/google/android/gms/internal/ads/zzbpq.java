package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbpq extends zzbpd {
    public static final /* synthetic */ int zza = 0;
    private WebViewClient zzb;
    private final P5.a zzc;
    private final WebView zzd;

    public zzbpq(Context context, WebView webView) {
        context.getClass();
        webView.getClass();
        zzgrc.zzb(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new P5.a(context, new zzbpp(webView));
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        W5.p.c("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    public final void onLoadResource(WebView webView, String str) {
        if (zzc(webView) && !this.zzc.b(str)) {
            super.onLoadResource(webView, str);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!zzc(this.zzd)) {
            return false;
        }
        if (this.zzc.b(webResourceRequest.getUrl().toString())) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public final void zza() {
        this.zzc.a();
    }

    public final void zzb(WebViewClient webViewClient) {
        zzgrc.zzb(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!zzc(webView)) {
            return false;
        }
        if (this.zzc.b(str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
