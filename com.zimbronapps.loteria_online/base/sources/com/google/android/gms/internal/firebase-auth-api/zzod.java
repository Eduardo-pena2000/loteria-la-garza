package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzod implements zzbh {
    final String zza;
    final zzwx.zzb zzb;
    private final Class zzc;

    public zzod(String str, Class cls, zzwx.zzb zzbVar, zzamv zzamvVar) {
        this.zza = str;
        this.zzc = cls;
        this.zzb = zzbVar;
    }

    public static zzbh zza(String str, Class cls, zzwx.zzb zzbVar, zzamv zzamvVar) {
        return new zzod(str, cls, zzbVar, zzamvVar);
    }

    public final Object zzb(zzajv zzajvVar) throws GeneralSecurityException {
        return zzpa.zza().zza(zzoz.zza().zza(zzqb.zza(this.zza, zzajvVar, this.zzb, zzxz.RAW, null), zzbf.zza()), this.zzc);
    }

    public static zzcd zza(String str, Class cls, zzamv zzamvVar) {
        return new zzoc(str, cls, zzamvVar);
    }

    public final zzwx zza(zzajv zzajvVar) throws GeneralSecurityException {
        zzqb zzqbVar = (zzqb) zzoz.zza().zza(zzop.zza().zza(zzoz.zza().zza(zzqe.zza((zzxb) ((zzalf) zzxb.zza().zza(this.zza).zza(zzajvVar).zza(zzxz.RAW).zze()))), (Integer) null), zzqb.class, zzbf.zza());
        return (zzwx) ((zzalf) zzwx.zza().zza(zzqbVar.zzf()).zza(zzqbVar.zzd()).zza(zzqbVar.zza()).zze());
    }

    public final String zzb() {
        return this.zza;
    }

    public final Class zza() {
        return this.zzc;
    }
}
