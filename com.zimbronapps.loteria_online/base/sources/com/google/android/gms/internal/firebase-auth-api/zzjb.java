package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import com.google.android.gms.internal.firebase-auth-api.zzjf;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzjb {
    private static final zzps zza = zzps.zza(new zzje(), zzja.class, zzbe.class);
    private static final zzbh zzb = zzod.zza("type.googleapis.com/google.crypto.tink.AesSivKey", zzbe.class, zzwx.zzb.SYMMETRIC, zzup.zze());
    private static final zzot zzc = new zzjd();
    private static final zzor zzd = new zzjg();

    public static /* synthetic */ zzbe zza(zzja zzjaVar) {
        zza((zzjf) ((zzjj) zzjaVar.zza()));
        return zzyx.zza(zzjaVar);
    }

    public static zzja zza(zzjf zzjfVar, Integer num) throws GeneralSecurityException {
        zza(zzjfVar);
        return zzja.zzc().zza(zzjfVar).zza(num).zza(zzaal.zza(zzjfVar.zzb())).zza();
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzjs.zza();
            zzpa.zza().zza(zza);
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", zzjq.zza);
            hashMap.put("AES256_SIV_RAW", zzjf.zzc().zza(64).zza(zzjf.zza.zzc).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzou.zza().zza(zzc, zzjf.class);
            zzop.zza().zza(zzd, zzjf.class);
            zznq.zza().zza(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
    }

    private static void zza(zzjf zzjfVar) throws GeneralSecurityException {
        if (zzjfVar.zzb() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + zzjfVar.zzb() + ". Valid keys must have 64 bytes.");
    }
}
