package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzcj {
    public static zzcb zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzxb zza = zzxb.zza(bArr, zzaku.zza());
            zzoz zza2 = zzoz.zza();
            zzqe zza3 = zzqe.zza(zza);
            return !zza2.zzc(zza3) ? new zzoi(zza3) : zza2.zza(zza3);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zza(zzcb zzcbVar) throws GeneralSecurityException {
        if (zzcbVar instanceof zzoi) {
            return ((zzoi) zzcbVar).zzb().zza().zzk();
        }
        return ((zzqe) zzoz.zza().zza(zzcbVar, zzqe.class)).zza().zzk();
    }
}
