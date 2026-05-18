package com.google.android.gms.internal.firebase-auth-api;

import K7.G0;
import K7.h;
import K7.s0;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadr extends zzaff {
    private final String zzv;

    public zzadr(String str) {
        super(2);
        this.zzv = str;
    }

    public final String zza() {
        return "signInAnonymously";
    }

    public final void zzb() {
        h zza = zzacq.zza(this.zzc, this.zzk);
        ((s0) this.zze).a(this.zzj, zza);
        zzb(new G0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzd(this.zzv, this.zzb);
    }
}
