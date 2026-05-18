package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbeb implements ValueCallback {
    private final /* synthetic */ zzbec zza;
    private final /* synthetic */ zzbdu zzb;
    private final /* synthetic */ WebView zzc;
    private final /* synthetic */ boolean zzd;

    public /* synthetic */ zzbeb(zzbec zzbecVar, zzbdu zzbduVar, WebView webView, boolean z) {
        this.zza = zzbecVar;
        this.zzb = zzbduVar;
        this.zzc = webView;
        this.zzd = z;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        this.zza.zze.zzd(this.zzb, this.zzc, (String) obj, this.zzd);
    }
}
