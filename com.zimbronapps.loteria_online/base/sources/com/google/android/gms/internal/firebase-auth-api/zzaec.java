package com.google.android.gms.internal.firebase-auth-api;

import K7.s0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaec extends zzaff {
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzaec(String str, String str2, String str3) {
        super(2);
        this.zzv = t.f(str);
        this.zzw = t.f(str2);
        this.zzx = str3;
    }

    public final String zza() {
        return "unenrollMfa";
    }

    public final void zzb() {
        ((s0) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
