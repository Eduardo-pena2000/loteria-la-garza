package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhdj {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhdg.zza, zzhdf.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesGcmKey", zzhas.class, zzhqb.zzb, zzhos.zze());
    private static final zzhjy zzd = zzhdi.zza;
    private static final zzhjb zze = zzhdh.zza;
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzhid.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzhgo.zza;
        zzhgo.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhkc zza2 = zzhkc.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzhfk.zza);
        zzhdk zzhdkVar = new zzhdk(null);
        zzhdkVar.zzb(12);
        zzhdkVar.zza(16);
        zzhdkVar.zzc(16);
        zzhdl zzhdlVar = zzhdl.zzc;
        zzhdkVar.zzd(zzhdlVar);
        hashMap.put("AES128_GCM_RAW", zzhdkVar.zze());
        hashMap.put("AES256_GCM", zzhfk.zzb);
        zzhdk zzhdkVar2 = new zzhdk(null);
        zzhdkVar2.zzb(12);
        zzhdkVar2.zza(32);
        zzhdkVar2.zzc(16);
        zzhdkVar2.zzd(zzhdlVar);
        hashMap.put("AES256_GCM_RAW", zzhdkVar2.zze());
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhjz.zza().zzb(zzd, zzhdm.class);
        zzhjx.zza().zzb(zze, zzhdm.class);
        zzhjc.zza().zzf(zzc, i, true);
    }
}
