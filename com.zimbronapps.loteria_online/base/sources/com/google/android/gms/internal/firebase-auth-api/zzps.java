package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzps {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzps(Class cls, Class cls2, zzpt zzptVar) {
        this(cls, cls2);
    }

    public static zzps zza(zzpu zzpuVar, Class cls, Class cls2) {
        return new zzpr(cls, cls2, zzpuVar);
    }

    public abstract Object zza(zzbi zzbiVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zzb;
    }

    private zzps(Class cls, Class cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class zza() {
        return this.zza;
    }
}
