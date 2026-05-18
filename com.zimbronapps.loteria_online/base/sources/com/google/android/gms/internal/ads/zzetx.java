package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzetx implements zzfav {
    private final String zza;
    private final boolean zzb;

    public zzetx(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (str != null) {
            Bundle zza = zzfjz.zza(zzdahVar.zza, "pii");
            zza.putString("afai", str);
            zza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
