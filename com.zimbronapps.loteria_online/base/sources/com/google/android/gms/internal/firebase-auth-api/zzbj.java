package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbj {
    private final zzcb zza;

    private zzbj(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    public static zzbj zza(zzcb zzcbVar) throws GeneralSecurityException {
        return new zzbj(zzcbVar);
    }

    private final zzxb zzb() {
        try {
            zzcb zzcbVar = this.zza;
            return zzcbVar instanceof zzoi ? ((zzoi) zzcbVar).zzb().zza() : ((zzqe) zzoz.zza().zza(this.zza, zzqe.class)).zza();
        } catch (GeneralSecurityException e) {
            throw new zzql("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + String.valueOf(this.zza), e);
        }
    }

    public final zzcb zza() throws GeneralSecurityException {
        zzcb zzcbVar = this.zza;
        return zzcbVar != null ? zzcbVar : zzcj.zza(zzb().zzk());
    }
}
