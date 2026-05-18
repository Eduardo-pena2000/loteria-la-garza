package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzexu implements zzfav {
    public final String zza;
    public final boolean zzb;

    public zzexu(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", "1");
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzdah) obj).zzb.putString("gct", this.zza);
    }
}
