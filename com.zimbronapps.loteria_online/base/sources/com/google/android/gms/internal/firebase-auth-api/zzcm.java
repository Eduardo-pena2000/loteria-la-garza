package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzwx;
import com.google.android.gms.internal.firebase-auth-api.zzxh;
import com.google.android.gms.internal.firebase-auth-api.zzxk;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcm {
    static {
        Charset.forName("UTF-8");
    }

    public static zzxk zza(zzxh zzxhVar) {
        zzxk.zza zza = zzxk.zza().zza(zzxhVar.zzb());
        for (zzxh.zzb zzbVar : zzxhVar.zze()) {
            zza.zza((zzxk.zzb) ((zzalf) zzxk.zzb.zza().zza(zzbVar.zzb().zzf()).zza(zzbVar.zzc()).zza(zzbVar.zzf()).zza(zzbVar.zza()).zze()));
        }
        return (zzxk) ((zzalf) zza.zze());
    }

    public static void zzb(zzxh zzxhVar) throws GeneralSecurityException {
        int zzb = zzxhVar.zzb();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzxh.zzb zzbVar : zzxhVar.zze()) {
            if (zzbVar.zzc() == zzxc.ENABLED) {
                if (!zzbVar.zzg()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzbVar.zza())}));
                }
                if (zzbVar.zzf() == zzxz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzbVar.zza())}));
                }
                if (zzbVar.zzc() == zzxc.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzbVar.zza())}));
                }
                if (zzbVar.zza() == zzb) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (zzbVar.zzb().zzb() != zzwx.zzb.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
