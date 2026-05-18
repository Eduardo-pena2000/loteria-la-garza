package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbec implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbdu zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbee zze;

    public zzbec(zzbee zzbeeVar, zzbdu zzbduVar, WebView webView, boolean z) {
        this.zzb = zzbduVar;
        this.zzc = webView;
        this.zzd = z;
        Objects.requireNonNull(zzbeeVar);
        this.zze = zzbeeVar;
        this.zza = new zzbeb(this, zzbduVar, webView, z);
    }

    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
