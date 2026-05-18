package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zznx {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zznx(Class cls, Class cls2, zzny zznyVar) {
        this(cls, cls2);
    }

    public static zznx zza(zznz zznzVar, Class cls, Class cls2) {
        return new zznw(cls, cls2, zznzVar);
    }

    public abstract zzqf zza(zzbi zzbiVar, zzch zzchVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zzb;
    }

    private zznx(Class cls, Class cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class zza() {
        return this.zza;
    }
}
