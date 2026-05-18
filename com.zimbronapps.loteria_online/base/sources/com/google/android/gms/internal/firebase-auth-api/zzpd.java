package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzpd {
    private final zzaaj zza;
    private final Class zzb;

    public /* synthetic */ zzpd(zzaaj zzaajVar, Class cls, zzpi zzpiVar) {
        this(zzaajVar, cls);
    }

    public static zzpd zza(zzpf zzpfVar, zzaaj zzaajVar, Class cls) {
        return new zzpg(zzaajVar, cls, zzpfVar);
    }

    public abstract zzcb zza(zzqf zzqfVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zzb;
    }

    private zzpd(zzaaj zzaajVar, Class cls) {
        this.zza = zzaajVar;
        this.zzb = cls;
    }

    public final zzaaj zza() {
        return this.zza;
    }
}
