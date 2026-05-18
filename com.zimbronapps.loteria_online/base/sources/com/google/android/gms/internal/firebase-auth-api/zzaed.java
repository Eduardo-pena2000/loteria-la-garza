package com.google.android.gms.internal.firebase-auth-api;

import K7.s0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaed extends zzaff {
    private final String zzv;

    public zzaed(String str) {
        super(2);
        this.zzv = t.g(str, "email cannot be null or empty");
    }

    public final String zza() {
        return "updateEmail";
    }

    public final void zzb() {
        ((s0) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzd.zze(), this.zzv, this.zzb);
    }
}
