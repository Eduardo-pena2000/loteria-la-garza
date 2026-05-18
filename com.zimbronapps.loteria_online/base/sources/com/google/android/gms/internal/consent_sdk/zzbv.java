package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.A6;
import com.applovin.impl.adview.F;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbv extends WebViewClient {
    final /* synthetic */ zzbx zza;

    public /* synthetic */ zzbv(zzbx zzbxVar, zzbw zzbwVar) {
        Objects.requireNonNull(zzbxVar);
        this.zza = zzbxVar;
    }

    public final void onLoadResource(WebView webView, String str) {
        zzbx zzbxVar = this.zza;
        if (zzbx.zzf(zzbxVar, str)) {
            zzbx.zza(zzbxVar).zze(str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        zzbx zzbxVar = this.zza;
        if (zzbx.zze(zzbxVar)) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbx.zzb(zzbxVar, true);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        zzbx.zza(this.zza).zzf(i, str, str2);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            return true;
        }
        String str = true != F.a(renderProcessGoneDetail) ? "was stopped by system" : "crashed";
        Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + A6.a(renderProcessGoneDetail));
        ViewGroup parent = webView.getParent();
        if (parent != null) {
            parent.removeView(webView);
        }
        webView.destroy();
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        zzbx zzbxVar = this.zza;
        if (!zzbx.zzf(zzbxVar, uri)) {
            return false;
        }
        zzbx.zza(zzbxVar).zze(uri);
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzbx zzbxVar = this.zza;
        if (!zzbx.zzf(zzbxVar, str)) {
            return false;
        }
        zzbx.zza(zzbxVar).zze(str);
        return true;
    }
}
