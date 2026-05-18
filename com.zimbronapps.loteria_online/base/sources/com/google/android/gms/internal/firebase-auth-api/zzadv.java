package com.google.android.gms.internal.firebase-auth-api;

import J7.j;
import K7.G0;
import K7.h;
import K7.s0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadv extends zzaff {
    private final zzagx zzv;

    public zzadv(j jVar, String str) {
        super(2);
        t.m(jVar, "credential cannot be null");
        this.zzv = new zzagx(jVar, null, str);
    }

    public final String zza() {
        return "sendSignInLinkToEmail";
    }

    public final void zzb() {
        h zza = zzacq.zza(this.zzc, this.zzk);
        ((s0) this.zze).a(this.zzj, zza);
        zzb(new G0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
