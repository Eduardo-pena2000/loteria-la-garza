package com.google.android.gms.internal.firebase-auth-api;

import J7.O;
import K7.G0;
import K7.h;
import K7.s0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzady extends zzaff {
    private final zzaan zzv;

    public zzady(O o, String str) {
        super(2);
        t.l(o);
        this.zzv = new zzaan(o, str);
    }

    public final String zza() {
        return "signInWithPhoneNumber";
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
