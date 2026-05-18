package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzpa {
    private static zzpa zza = new zzpa();
    private final AtomicReference zzb = new AtomicReference(zzpw.zza().zza());

    public static zzpa zza() {
        return zza;
    }

    public final Object zza(zzbi zzbiVar, Class cls) throws GeneralSecurityException {
        return ((zzpw) this.zzb.get()).zza(zzbiVar, cls);
    }

    public final synchronized void zza(zzps zzpsVar) throws GeneralSecurityException {
        this.zzb.set(zzpw.zza((zzpw) this.zzb.get()).zza(zzpsVar).zza());
    }

    public final synchronized void zza(zzpz zzpzVar) throws GeneralSecurityException {
        this.zzb.set(zzpw.zza((zzpw) this.zzb.get()).zza(zzpzVar).zza());
    }
}
