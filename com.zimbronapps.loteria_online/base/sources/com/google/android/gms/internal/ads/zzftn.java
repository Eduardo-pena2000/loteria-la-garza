package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzftn implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    public zzftn(zzfto zzftoVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        Objects.requireNonNull(zzftoVar);
    }

    public final void run() {
        zzfto.zzk(this.zza, this.zzb);
    }
}
