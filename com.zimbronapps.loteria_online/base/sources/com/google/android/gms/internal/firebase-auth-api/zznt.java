package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zznt {
    private final zzaaj zza;
    private final Class zzb;

    public /* synthetic */ zznt(zzaaj zzaajVar, Class cls, zznu zznuVar) {
        this(zzaajVar, cls);
    }

    public static zznt zza(zznv zznvVar, zzaaj zzaajVar, Class cls) {
        return new zzns(zzaajVar, cls, zznvVar);
    }

    public abstract zzbi zza(zzqf zzqfVar, zzch zzchVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zzb;
    }

    private zznt(zzaaj zzaajVar, Class cls) {
        this.zza = zzaajVar;
        this.zzb = cls;
    }

    public final zzaaj zza() {
        return this.zza;
    }
}
