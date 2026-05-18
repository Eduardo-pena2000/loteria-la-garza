package com.google.android.gms.internal.firebase-auth-api;

import J7.e;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaeh extends zzaff {
    private final zzahm zzv;

    public zzaeh(String str, String str2, e eVar) {
        super(6);
        t.f(str);
        t.f(str2);
        t.l(eVar);
        this.zzv = zzahm.zza(eVar, str, str2);
    }

    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzc(this.zzv, this.zzb);
    }
}
