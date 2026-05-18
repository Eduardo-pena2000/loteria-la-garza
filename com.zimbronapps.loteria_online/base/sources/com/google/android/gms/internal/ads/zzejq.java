package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzejq implements zzeju {
    private final /* synthetic */ W5.a zza;
    private final /* synthetic */ WebView zzb;

    public /* synthetic */ zzejq(W5.a aVar, WebView webView, boolean z) {
        this.zza = aVar;
        this.zzb = webView;
    }

    public final /* synthetic */ Object zza() {
        W5.a aVar = this.zza;
        int i = aVar.b;
        int i2 = aVar.c;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        return zzfsv.zza(zzfsx.zza("Google", sb.toString()), this.zzb, true);
    }
}
