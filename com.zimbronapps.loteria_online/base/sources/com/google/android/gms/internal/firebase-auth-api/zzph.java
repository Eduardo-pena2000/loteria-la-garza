package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzph {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzph(Class cls, Class cls2, zzpm zzpmVar) {
        this(cls, cls2);
    }

    public static zzph zza(zzpj zzpjVar, Class cls, Class cls2) {
        return new zzpk(cls, cls2, zzpjVar);
    }

    public abstract zzqf zza(zzcb zzcbVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zzb;
    }

    private zzph(Class cls, Class cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class zza() {
        return this.zza;
    }
}
