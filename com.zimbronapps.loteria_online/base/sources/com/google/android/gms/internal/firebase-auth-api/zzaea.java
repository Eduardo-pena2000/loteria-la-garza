package com.google.android.gms.internal.firebase-auth-api;

import K7.o;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaea extends zzaff {
    private final zzaiu zzv;

    public zzaea(o oVar, String str) {
        super(12);
        t.l(oVar);
        this.zzv = zzaiu.zza(t.f(oVar.zzb()), str);
    }

    public final String zza() {
        return "startMfaEnrollment";
    }

    public final void zzb() {
        zzb(this.zzt);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
