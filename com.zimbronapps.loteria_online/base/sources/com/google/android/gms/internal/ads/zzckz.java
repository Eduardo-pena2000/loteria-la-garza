package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzckz extends zzcky {
    public zzckz(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z, zzejf zzejfVar) {
        super(zzcjlVar, zzbgdVar, z, zzejfVar);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzac(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
