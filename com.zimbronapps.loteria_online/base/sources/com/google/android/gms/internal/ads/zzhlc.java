package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhlc implements zzhlg {
    private final zzhye zza;
    private final zzhqf zzb;

    private zzhlc(zzhqf zzhqfVar, zzhye zzhyeVar) {
        this.zzb = zzhqfVar;
        this.zza = zzhyeVar;
    }

    public static zzhlc zza(zzhqf zzhqfVar) {
        return new zzhlc(zzhqfVar, zzhln.zza(zzhqfVar.zza()));
    }

    public static zzhlc zzb(zzhqf zzhqfVar) throws GeneralSecurityException {
        return new zzhlc(zzhqfVar, zzhln.zzb(zzhqfVar.zza()));
    }

    public final zzhqf zzc() {
        return this.zzb;
    }

    public final zzhye zzf() {
        return this.zza;
    }
}
