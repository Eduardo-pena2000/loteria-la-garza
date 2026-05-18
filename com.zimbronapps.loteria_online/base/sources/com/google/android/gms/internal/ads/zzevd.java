package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzevd implements zzfav {
    private final double zza;
    private final boolean zzb;

    public zzevd(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        Bundle zza = zzfjz.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfjz.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
