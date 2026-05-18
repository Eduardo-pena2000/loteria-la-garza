package com.google.android.gms.internal.firebase-auth-api;

import K7.B0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzacs extends zzaff {
    private final String zzv;
    private final String zzw;

    public zzacs(String str, String str2) {
        super(4);
        t.g(str, "code cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
    }

    public final String zza() {
        return "checkActionCode";
    }

    public final void zzb() {
        zzb(new B0(this.zzm));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzd(this.zzv, this.zzw, this.zzb);
    }
}
