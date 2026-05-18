package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfbe implements zzfav {
    private final int zza;
    private final int zzb;

    public zzfbe(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i;
        Bundle bundle = ((zzdah) obj).zza;
        int i2 = this.zza;
        if (i2 == -1 || (i = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i2);
        bundle.putInt("crashes_without_flags", i);
        S5.B b = S5.B.g;
        if (S5.D.c().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
