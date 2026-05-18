package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhfo {
    private static final zzhjb zza = zzhfn.zza;
    private static final zzhku zzb = zzhku.zzd(zzhfm.zza, zzhfl.class, zzhas.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzhhq.zza;
        zzhhq.zza(zzhkg.zza());
        zzhkc zza2 = zzhkc.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzhfk.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhfk.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhfk.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhfk.zzj);
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhkd.zza().zzb(zzb);
        zzhjx.zza().zzb(zza, zzhfq.class);
    }
}
