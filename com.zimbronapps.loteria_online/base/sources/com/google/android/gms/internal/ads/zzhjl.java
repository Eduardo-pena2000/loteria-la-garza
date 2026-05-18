package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzhjl implements zzhba {
    final String zza;
    final Class zzb;
    final zzhqb zzc;

    public zzhjl(String str, Class cls, zzhqb zzhqbVar, zzidk zzidkVar) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzhqbVar;
    }

    public static zzhba zze(String str, Class cls, zzhqb zzhqbVar, zzidk zzidkVar) {
        return new zzhjl(str, cls, zzhqbVar, zzidkVar);
    }

    public static zzhbq zzf(String str, Class cls, zzidk zzidkVar) {
        return new zzhjk(str, cls, zzidkVar);
    }

    public final Object zza(zzian zzianVar) throws GeneralSecurityException {
        return zzhkd.zza().zzd(zzhkg.zza().zzg(zzhlb.zza(this.zza, zzianVar, this.zzc, zzhqy.zzd, null), zzhax.zza()), this.zzb);
    }

    public final String zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }

    public final zzhqc zzd(zzian zzianVar) throws GeneralSecurityException {
        zzhqe zze = zzhqf.zze();
        zze.zza(this.zza);
        zze.zzb(zzianVar);
        zze.zzc(zzhqy.zzd);
        zzhlb zzhlbVar = (zzhlb) zzhkg.zza().zzh(zzhjx.zza().zzc(zzhkg.zza().zzj(zzhlc.zzb((zzhqf) zze.zzbm())), null), zzhlb.class, zzhax.zza());
        zzhqa zzd = zzhqc.zzd();
        zzd.zza(zzhlbVar.zzg());
        zzd.zzb(zzhlbVar.zzb());
        zzd.zzc(zzhlbVar.zzc());
        return (zzhqc) zzd.zzbm();
    }
}
