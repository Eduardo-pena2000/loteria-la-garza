package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhtq implements zzhla {
    private static final zzhtq zza = new zzhtq();
    private static final zzhku zzb = zzhku.zzd(zzhtn.zza, zzhjo.class, zzhbr.class);

    public static void zzc() throws GeneralSecurityException {
        zzhkd.zza().zzc(zza);
        zzhkd.zza().zzb(zzb);
    }

    public final Class zza() {
        return zzhbr.class;
    }

    public final Class zzb() {
        return zzhbr.class;
    }

    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhjs zza2 = !zzhjrVar.zza() ? zzhkb.zza().zzb().zza(zzhjjVar, zzhjrVar, "public_key_sign", "sign") : zzhjv.zza;
        zzhbk zzhbkVar = (zzhbk) zzhjjVar;
        return new zzhtp(new zzhto((zzhbr) zzhkzVar.zza(zzhbkVar.zzc()), zzhbkVar.zzc().zzc()), zza2);
    }
}
