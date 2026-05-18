package com.google.android.gms.internal.firebase-auth-api;

import J7.O;
import K7.s0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaef extends zzaff {
    private final O zzv;

    public zzaef(O o) {
        super(2);
        this.zzv = (O) t.l(o);
    }

    public final String zza() {
        return "updatePhoneNumber";
    }

    public final void zzb() {
        ((s0) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(new zzahz(this.zzd.zze(), zzafw.zza(this.zzv)), this.zzb);
    }
}
