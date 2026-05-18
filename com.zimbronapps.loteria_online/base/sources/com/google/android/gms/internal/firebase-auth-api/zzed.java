package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzeg;
import com.google.android.gms.internal.firebase-auth-api.zziv;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzed {
    private static final zzps zza = zzps.zza(new zzec(), zzdz.class, zzba.class);
    private static final zzor zzb = new zzef();
    private static final zzot zzc = new zzee();
    private static final zzbh zzd = zzod.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzba.class, zzwx.zzb.SYMMETRIC, zzuj.zze());

    public static /* synthetic */ zzdz zza(zzeg zzegVar, Integer num) {
        return zzdz.zze().zza(zzegVar).zza(num).zza(zzaal.zza(zzegVar.zzb())).zza();
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzhb.zza();
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            zzeg.zza zza3 = zzeg.zzc().zza(16);
            zzeg.zzb zzbVar = zzeg.zzb.zza;
            hashMap.put("AES128_GCM_SIV", zza3.zza(zzbVar).zza());
            zzeg.zza zza4 = zzeg.zzc().zza(16);
            zzeg.zzb zzbVar2 = zzeg.zzb.zzc;
            hashMap.put("AES128_GCM_SIV_RAW", zza4.zza(zzbVar2).zza());
            hashMap.put("AES256_GCM_SIV", zzeg.zzc().zza(32).zza(zzbVar).zza());
            hashMap.put("AES256_GCM_SIV_RAW", zzeg.zzc().zza(32).zza(zzbVar2).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzou.zza().zza(zzc, zzeg.class);
            zzop.zza().zza(zzb, zzeg.class);
            zzpa.zza().zza(zza);
            zznq.zza().zza(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
    }
}
