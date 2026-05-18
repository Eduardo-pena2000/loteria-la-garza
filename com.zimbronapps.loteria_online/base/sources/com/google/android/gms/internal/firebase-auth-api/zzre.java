package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import com.google.android.gms.internal.firebase-auth-api.zzrh;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzre {
    private static final zzps zza = zzps.zza(new zzrd(), zzra.class, zzqw.class);
    private static final zzps zzb = zzps.zza(new zzrg(), zzra.class, zzcc.class);
    private static final zzbh zzc = zzod.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzcc.class, zzwx.zzb.SYMMETRIC, zzwb.zzg());
    private static final zzot zzd = new zzrf();
    private static final zzor zze = new zzri();
    private static final zziv.zza zzf = zziv.zza.zzb;

    public static zzra zza(zzrh zzrhVar, Integer num) throws GeneralSecurityException {
        return zzra.zzc().zza(zzrhVar).zza(zzaal.zza(zzrhVar.zzc())).zza(num).zza();
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        zziv.zza zzaVar = zzf;
        if (zzaVar.zza()) {
            zzsj.zza();
            zzpa.zza().zza(zza);
            zzpa.zza().zza(zzb);
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", zzrt.zza);
            zzrh.zzb zzb2 = zzrh.zzd().zza(32).zzb(16);
            zzrh.zzc zzcVar = zzrh.zzc.zzd;
            zzrh.zzb zza3 = zzb2.zza(zzcVar);
            zzrh.zza zzaVar2 = zzrh.zza.zzc;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", zza3.zza(zzaVar2).zza());
            zzrh.zzb zzb3 = zzrh.zzd().zza(32).zzb(32);
            zzrh.zzc zzcVar2 = zzrh.zzc.zza;
            hashMap.put("HMAC_SHA256_256BITTAG", zzb3.zza(zzcVar2).zza(zzaVar2).zza());
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzrh.zzd().zza(32).zzb(32).zza(zzcVar).zza(zzaVar2).zza());
            zzrh.zzb zza4 = zzrh.zzd().zza(64).zzb(16).zza(zzcVar2);
            zzrh.zza zzaVar3 = zzrh.zza.zze;
            hashMap.put("HMAC_SHA512_128BITTAG", zza4.zza(zzaVar3).zza());
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzrh.zzd().zza(64).zzb(16).zza(zzcVar).zza(zzaVar3).zza());
            hashMap.put("HMAC_SHA512_256BITTAG", zzrh.zzd().zza(64).zzb(32).zza(zzcVar2).zza(zzaVar3).zza());
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzrh.zzd().zza(64).zzb(32).zza(zzcVar).zza(zzaVar3).zza());
            hashMap.put("HMAC_SHA512_512BITTAG", zzrt.zzb);
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzrh.zzd().zza(64).zzb(64).zza(zzcVar).zza(zzaVar3).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzop.zza().zza(zze, zzrh.class);
            zzou.zza().zza(zzd, zzrh.class);
            zznq.zza().zza(zzc, zzaVar, true);
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
