package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import com.google.android.gms.internal.firebase-auth-api.zzqu;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqq {
    private static final zzor zza = new zzqt();
    private static final zzps zzb = zzps.zza(new zzqs(), zzqp.class, zzqw.class);
    private static final zzps zzc = zzps.zza(new zzqv(), zzqp.class, zzcc.class);
    private static final zzbh zzd = zzod.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", zzcc.class, zzwx.zzb.SYMMETRIC, zzsw.zzf());

    public static /* synthetic */ zzcc zza(zzqp zzqpVar) {
        zza((zzqu) ((zzrn) zzqpVar.zza()));
        return zzaag.zza(zzqpVar);
    }

    public static /* synthetic */ zzqw zzb(zzqp zzqpVar) {
        zza((zzqu) ((zzrn) zzqpVar.zza()));
        return zzsh.zza(zzqpVar);
    }

    public static /* synthetic */ zzqp zza(zzqu zzquVar, Integer num) {
        zza(zzquVar);
        return zzqp.zzc().zza(zzquVar).zza(zzaal.zza(zzquVar.zzc())).zza(num).zza();
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzrz.zza();
            zzop.zza().zza(zza, zzqu.class);
            zzpa.zza().zza(zzb);
            zzpa.zza().zza(zzc);
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            zzqu zzquVar = zzrt.zzc;
            hashMap.put("AES_CMAC", zzquVar);
            hashMap.put("AES256_CMAC", zzquVar);
            hashMap.put("AES256_CMAC_RAW", zzqu.zzd().zza(32).zzb(16).zza(zzqu.zza.zzd).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zznq.zza().zza(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
    }

    private static void zza(zzqu zzquVar) throws GeneralSecurityException {
        if (zzquVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
