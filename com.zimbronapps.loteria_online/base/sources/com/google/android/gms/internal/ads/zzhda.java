package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhda {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhcy.zza, zzhcx.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesEaxKey", zzhas.class, zzhqb.zzb, zzhom.zzg());
    private static final zzhjb zzd = zzhcz.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i = zzhgh.zza;
        zzhgh.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhkc zza2 = zzhkc.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzhfk.zzc);
        zzhdb zzhdbVar = new zzhdb(null);
        zzhdbVar.zzb(16);
        zzhdbVar.zza(16);
        zzhdbVar.zzc(16);
        zzhdc zzhdcVar = zzhdc.zzc;
        zzhdbVar.zzd(zzhdcVar);
        hashMap.put("AES128_EAX_RAW", zzhdbVar.zze());
        hashMap.put("AES256_EAX", zzhfk.zzd);
        zzhdb zzhdbVar2 = new zzhdb(null);
        zzhdbVar2.zzb(16);
        zzhdbVar2.zza(32);
        zzhdbVar2.zzc(16);
        zzhdbVar2.zzd(zzhdcVar);
        hashMap.put("AES256_EAX_RAW", zzhdbVar2.zze());
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhjx.zza().zzb(zzd, zzhdd.class);
        zzhjc.zza().zzb(zzc, true);
    }
}
