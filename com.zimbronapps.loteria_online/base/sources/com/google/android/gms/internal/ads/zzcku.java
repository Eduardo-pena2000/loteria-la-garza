package com.google.android.gms.internal.ads;

import V5.o0;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcku implements zzckv {
    private final /* synthetic */ zzcjl zza;

    public /* synthetic */ zzcku(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    public final /* synthetic */ void zza(Uri uri) {
        zzcjw zzaS = ((zzcko) this.zza).zzaS();
        if (zzaS != null) {
            zzaS.zzQ(uri);
        } else {
            int i = o0.b;
            W5.p.c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        }
    }
}
