package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfv {
    private static final zzor zza = new zzfy();
    private static final zzps zzb = zzps.zza(new zzfx(), zzfw.class, zzba.class);

    public static /* synthetic */ zzfw zza(zzfz zzfzVar, Integer num) {
        return zzfw.zza(zzfzVar, zzaal.zza(32), num);
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        zzie.zza();
        zzox zza2 = zzox.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzfm.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzfm.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzfm.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzfm.zzj);
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zzpa.zza().zza(zzb);
        zzop.zza().zza(zza, zzfz.class);
    }
}
