package com.google.android.gms.internal.firebase-auth-api;

import J7.j;
import K7.G0;
import K7.h;
import K7.s0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadc extends zzaff {
    private final j zzv;
    private final String zzw;

    public zzadc(j jVar, String str) {
        super(2);
        this.zzv = (j) t.m(jVar, "credential cannot be null");
        t.g(jVar.zzc(), "email cannot be null");
        t.g(jVar.zzd(), "password cannot be null");
        this.zzw = str;
    }

    public final String zza() {
        return "linkEmailAuthCredential";
    }

    public final void zzb() {
        h zza = zzacq.zza(this.zzc, this.zzk);
        ((s0) this.zze).a(this.zzj, zza);
        zzb(new G0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv.zzc(), t.f(this.zzv.zzd()), this.zzd.zze(), this.zzd.R1(), this.zzw, this.zzb);
    }
}
