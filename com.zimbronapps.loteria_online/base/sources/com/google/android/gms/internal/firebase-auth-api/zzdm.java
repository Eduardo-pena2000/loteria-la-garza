package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzdq;
import com.google.android.gms.internal.firebase-auth-api.zziv;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzdm {
    private static final zzps zza = zzps.zza(new zzdp(), zzdl.class, zzba.class);
    private static final zzbh zzb = zzod.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", zzba.class, zzwx.zzb.SYMMETRIC, zztu.zzf());
    private static final zzor zzc = new zzdo();

    public static /* synthetic */ zzdl zza(zzdq zzdqVar, Integer num) {
        if (zzdqVar.zzc() != 24) {
            return zzdl.zze().zza(zzdqVar).zza(num).zza(zzaal.zza(zzdqVar.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzgl.zza();
            zzpa.zza().zza(zza);
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", zzfm.zzc);
            zzdq.zza zzc2 = zzdq.zze().zza(16).zzb(16).zzc(16);
            zzdq.zzb zzbVar = zzdq.zzb.zzc;
            hashMap.put("AES128_EAX_RAW", zzc2.zza(zzbVar).zza());
            hashMap.put("AES256_EAX", zzfm.zzd);
            hashMap.put("AES256_EAX_RAW", zzdq.zze().zza(16).zzb(32).zzc(16).zza(zzbVar).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzop.zza().zza(zzc, zzdq.class);
            zznq.zza().zza(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}
