package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhds {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhdp.zza, zzhdo.class, zzhas.class);
    private static final zzhjb zzc = zzhdr.zza;
    private static final zzhjy zzd = zzhdq.zza;
    private static final zzhba zze = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzhas.class, zzhqb.zzb, zzhow.zze());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = zzhgv.zza;
        zzhgv.zza(zzhkg.zza());
        zzhkc zza2 = zzhkc.zza();
        HashMap hashMap = new HashMap();
        zzhdt zzhdtVar = new zzhdt(null);
        zzhdtVar.zza(16);
        zzhdu zzhduVar = zzhdu.zza;
        zzhdtVar.zzb(zzhduVar);
        hashMap.put("AES128_GCM_SIV", zzhdtVar.zzc());
        zzhdt zzhdtVar2 = new zzhdt(null);
        zzhdtVar2.zza(16);
        zzhdu zzhduVar2 = zzhdu.zzc;
        zzhdtVar2.zzb(zzhduVar2);
        hashMap.put("AES128_GCM_SIV_RAW", zzhdtVar2.zzc());
        zzhdt zzhdtVar3 = new zzhdt(null);
        zzhdtVar3.zza(32);
        zzhdtVar3.zzb(zzhduVar);
        hashMap.put("AES256_GCM_SIV", zzhdtVar3.zzc());
        zzhdt zzhdtVar4 = new zzhdt(null);
        zzhdtVar4.zza(32);
        zzhdtVar4.zzb(zzhduVar2);
        hashMap.put("AES256_GCM_SIV_RAW", zzhdtVar4.zzc());
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhjz.zza().zzb(zzd, zzhdv.class);
        zzhjx.zza().zzb(zzc, zzhdv.class);
        zzhkd.zza().zzb(zzb);
        zzhjc.zza().zzb(zze, true);
    }
}
