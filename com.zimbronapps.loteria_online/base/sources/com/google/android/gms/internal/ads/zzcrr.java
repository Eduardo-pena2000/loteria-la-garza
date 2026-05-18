package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcrr implements zzgyw {
    private final /* synthetic */ Uri.Builder zza;

    public /* synthetic */ zzcrr(Uri.Builder builder) {
        this.zza = builder;
    }

    public final /* synthetic */ x7.e zza(Object obj) {
        String str = (String) S5.D.c().zzd(zzbhe.zzlH);
        Uri.Builder builder = this.zza;
        builder.appendQueryParameter(str, "12");
        return zzgzo.zza(builder.toString());
    }
}
