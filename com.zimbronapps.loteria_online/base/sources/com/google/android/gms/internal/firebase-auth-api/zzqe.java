package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqe implements zzqf {
    private final zzaaj zza;
    private final zzxb zzb;

    private zzqe(zzxb zzxbVar, zzaaj zzaajVar) {
        this.zzb = zzxbVar;
        this.zza = zzaajVar;
    }

    public static zzqe zza(zzxb zzxbVar) throws GeneralSecurityException {
        return new zzqe(zzxbVar, zzqn.zza(zzxbVar.zzf()));
    }

    public static zzqe zzb(zzxb zzxbVar) {
        return new zzqe(zzxbVar, zzqn.zzb(zzxbVar.zzf()));
    }

    public final zzaaj zzc() {
        return this.zza;
    }

    public final zzxb zza() {
        return this.zzb;
    }
}
