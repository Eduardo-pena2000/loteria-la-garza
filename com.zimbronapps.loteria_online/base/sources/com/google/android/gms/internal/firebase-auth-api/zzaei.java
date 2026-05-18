package com.google.android.gms.internal.firebase-auth-api;

import J7.d0;
import K7.s0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaei extends zzaff {
    private final d0 zzv;

    public zzaei(d0 d0Var) {
        super(2);
        this.zzv = (d0) t.m(d0Var, "request cannot be null");
    }

    public final String zza() {
        return "updateProfile";
    }

    public final void zzb() {
        ((s0) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzd.zze(), this.zzv, this.zzb);
    }
}
