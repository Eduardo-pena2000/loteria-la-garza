package com.google.android.gms.internal.firebase-auth-api;

import J7.h;
import K7.r0;
import K7.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadg extends zzaff {
    private final zzajb zzv;

    public zzadg(h hVar, String str) {
        super(2);
        t.m(hVar, "credential cannot be null");
        this.zzv = r0.a(hVar, str).zza(false);
    }

    public final String zza() {
        return "reauthenticateWithCredential";
    }

    public final void zzb() {
        K7.h zza = zzacq.zza(this.zzc, this.zzk);
        if (!this.zzd.b().equalsIgnoreCase(zza.b())) {
            zza(new Status(17024));
        } else {
            ((s0) this.zze).a(this.zzj, zza);
            zzb(null);
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
