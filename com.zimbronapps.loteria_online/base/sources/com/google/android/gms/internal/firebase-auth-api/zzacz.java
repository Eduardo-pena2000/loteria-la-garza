package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzacz extends zzaff {
    private final zzaht zzv;

    public zzacz(String str, String str2) {
        super(10);
        t.f(str2);
        this.zzv = zzaht.zza(str, str2);
    }

    public final String zza() {
        return "getRecaptchaConfig";
    }

    public final void zzb() {
        zzb(this.zzr);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
