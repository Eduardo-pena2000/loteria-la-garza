package com.google.android.gms.internal.firebase-auth-api;

import J7.h;
import K7.G0;
import K7.r0;
import K7.s0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadb extends zzaff {
    private final zzajb zzv;

    public zzadb(h hVar) {
        super(2);
        t.m(hVar, "credential cannot be null");
        this.zzv = r0.a(hVar, null);
    }

    public final String zza() {
        return "linkFederatedCredential";
    }

    public final void zzb() {
        K7.h zza = zzacq.zza(this.zzc, this.zzk);
        ((s0) this.zze).a(this.zzj, zza);
        zzb(new G0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzd.zze(), this.zzv, this.zzb);
    }
}
