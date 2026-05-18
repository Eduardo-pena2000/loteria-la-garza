package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzada extends zzaff {
    private final zzaho zzv;

    public zzada() {
        super(11);
        this.zzv = zzaho.zzb();
    }

    public final String zza() {
        return "getRecaptchaParam";
    }

    public final void zzb() {
        zzb(this.zzs);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
