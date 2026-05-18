package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzexy implements zzfav {
    private final Integer zza;

    public zzexy(Integer num) {
        this.zza = num;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        zzdah zzdahVar = (zzdah) obj;
        if (num != null) {
            zzdahVar.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
