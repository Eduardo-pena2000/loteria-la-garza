package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhbv {
    public static byte[] zza(zzhbp zzhbpVar) throws GeneralSecurityException {
        return ((zzhlc) zzhkg.zza().zzk(zzhbpVar, zzhlc.class)).zzc().zzaN();
    }

    public static zzhbp zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhqf zzd = zzhqf.zzd(bArr, zzibb.zza());
            zzhkg zza = zzhkg.zza();
            zzhlc zzb = zzhlc.zzb(zzd);
            return !zza.zzi(zzb) ? new zzhjp(zzb) : zza.zzj(zzb);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
