package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhnm implements zzhbo {
    private zzhnm(zzhbo zzhboVar, zzhqy zzhqyVar, byte[] bArr) {
    }

    public static zzhbo zza(zzhjo zzhjoVar) throws GeneralSecurityException {
        byte[] zzc;
        zzhlb zzc2 = zzhjoVar.zzc(zzhax.zza());
        zzhbo zzhboVar = (zzhbo) zzhjc.zza().zzc(zzc2.zzg(), zzhbo.class).zza(zzc2.zzb());
        zzhqy zzd = zzc2.zzd();
        int ordinal = zzd.ordinal();
        if (ordinal == 1) {
            zzc = zzhkh.zzb(zzhjoVar.zzb().intValue()).zzc();
        } else if (ordinal == 2) {
            zzc = zzhkh.zza(zzhjoVar.zzb().intValue()).zzc();
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzc = zzhkh.zza(zzhjoVar.zzb().intValue()).zzc();
        } else {
            zzc = zzhkh.zza.zzc();
        }
        return new zzhnm(zzhboVar, zzd, zzc);
    }
}
