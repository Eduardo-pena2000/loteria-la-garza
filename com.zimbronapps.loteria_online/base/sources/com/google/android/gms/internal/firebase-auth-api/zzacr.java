package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzacr extends zzaff {
    private final zzaic zzv;

    public zzacr(String str, String str2, String str3) {
        super(4);
        t.g(str, "code cannot be null or empty");
        t.g(str2, "new password cannot be null or empty");
        this.zzv = new zzaic(str, str2, str3);
    }

    public final String zza() {
        return "confirmPasswordReset";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
