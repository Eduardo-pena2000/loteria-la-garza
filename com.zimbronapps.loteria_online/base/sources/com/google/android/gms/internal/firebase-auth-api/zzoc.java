package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzoc extends zzod implements zzcd {
    public zzoc(String str, Class cls, zzamv zzamvVar) {
        super(str, cls, zzwx.zzb.ASYMMETRIC_PRIVATE, zzamvVar);
    }

    public final zzwx zzc(zzajv zzajvVar) throws GeneralSecurityException {
        Object zza = zzoz.zza().zza(zzqb.zza(this.zza, zzajvVar, this.zzb, zzxz.RAW, null), zzbf.zza());
        if (!(zza instanceof zzce)) {
            throw new GeneralSecurityException("Key not private key");
        }
        zzqb zzqbVar = (zzqb) zzoz.zza().zza(((zzce) zza).zzc(), zzqb.class, zzbf.zza());
        return (zzwx) ((zzalf) zzwx.zza().zza(zzqbVar.zzf()).zza(zzqbVar.zzd()).zza(zzqbVar.zza()).zze());
    }
}
