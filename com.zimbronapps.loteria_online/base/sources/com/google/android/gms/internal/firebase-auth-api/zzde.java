package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzdi;
import com.google.android.gms.internal.firebase-auth-api.zziv;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzde {
    private static final zzps zza = zzps.zza(new zzdh(), zzdd.class, zzba.class);
    private static final zzbh zzb = zzod.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzba.class, zzwx.zzb.SYMMETRIC, zztf.zzf());
    private static final zzot zzc = new zzdg();
    private static final zzor zzd = new zzdj();
    private static final zziv.zza zze = zziv.zza.zzb;

    public static zzdd zza(zzdi zzdiVar, Integer num) throws GeneralSecurityException {
        if (zzdiVar.zzb() == 16 || zzdiVar.zzb() == 32) {
            return zzdd.zze().zza(zzdiVar).zza(num).zza(zzaal.zza(zzdiVar.zzb())).zzb(zzaal.zza(zzdiVar.zzc())).zza();
        }
        throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        zziv.zza zzaVar = zze;
        if (zzaVar.zza()) {
            zzgg.zza();
            zzpa.zza().zza(zza);
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", zzfm.zze);
            zzdi.zzb zzc2 = zzdi.zzf().zza(16).zzb(32).zzd(16).zzc(16);
            zzdi.zza zzaVar2 = zzdi.zza.zzc;
            zzdi.zzb zza3 = zzc2.zza(zzaVar2);
            zzdi.zzc zzcVar = zzdi.zzc.zzc;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zza3.zza(zzcVar).zza());
            hashMap.put("AES256_CTR_HMAC_SHA256", zzfm.zzf);
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzdi.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzaVar2).zza(zzcVar).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzou.zza().zza(zzc, zzdi.class);
            zzop.zza().zza(zzd, zzdi.class);
            zznq.zza().zza(zzb, zzaVar, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
