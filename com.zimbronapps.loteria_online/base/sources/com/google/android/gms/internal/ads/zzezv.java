package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzezv implements zzfav {
    private final String zza;
    private final int zzb;

    public zzezv(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        bundle.putString("request_id", this.zza);
        if (this.zzb == 2) {
            bundle.putInt("sod", 1);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzdah) obj).zzb.putString("request_id", this.zza);
    }
}
