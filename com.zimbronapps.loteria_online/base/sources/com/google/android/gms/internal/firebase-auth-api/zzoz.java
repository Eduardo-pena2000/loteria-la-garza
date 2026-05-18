package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzoz {
    private static final zzoz zza = (zzoz) zzql.zza(new zzpc());
    private final AtomicReference zzb = new AtomicReference(new zzqh().zza());

    public final zzbi zza(zzqf zzqfVar, zzch zzchVar) throws GeneralSecurityException {
        return ((zzqi) this.zzb.get()).zza(zzqfVar, zzchVar);
    }

    public final boolean zzb(zzqf zzqfVar) {
        return ((zzqi) this.zzb.get()).zzb(zzqfVar);
    }

    public final boolean zzc(zzqf zzqfVar) {
        return ((zzqi) this.zzb.get()).zzc(zzqfVar);
    }

    public final zzcb zza(zzqf zzqfVar) throws GeneralSecurityException {
        return ((zzqi) this.zzb.get()).zza(zzqfVar);
    }

    public static zzoz zza() {
        return zza;
    }

    public final zzqf zza(zzbi zzbiVar, Class cls, zzch zzchVar) throws GeneralSecurityException {
        return ((zzqi) this.zzb.get()).zza(zzbiVar, cls, zzchVar);
    }

    public final zzqf zza(zzcb zzcbVar, Class cls) throws GeneralSecurityException {
        return ((zzqi) this.zzb.get()).zza(zzcbVar, cls);
    }

    public final synchronized void zza(zznt zzntVar) throws GeneralSecurityException {
        this.zzb.set(new zzqh((zzqi) this.zzb.get()).zza(zzntVar).zza());
    }

    public final synchronized void zza(zznx zznxVar) throws GeneralSecurityException {
        this.zzb.set(new zzqh((zzqi) this.zzb.get()).zza(zznxVar).zza());
    }

    public final synchronized void zza(zzpd zzpdVar) throws GeneralSecurityException {
        this.zzb.set(new zzqh((zzqi) this.zzb.get()).zza(zzpdVar).zza());
    }

    public final synchronized void zza(zzph zzphVar) throws GeneralSecurityException {
        this.zzb.set(new zzqh((zzqi) this.zzb.get()).zza(zzphVar).zza());
    }
}
