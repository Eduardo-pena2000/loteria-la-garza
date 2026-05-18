package com.google.android.gms.internal.firebase-auth-api;

import K7.G0;
import K7.h;
import K7.s0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzacu extends zzaff {
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzacu(String str, String str2, String str3, String str4) {
        super(2);
        t.g(str, "email cannot be null or empty");
        t.g(str2, "password cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
        this.zzx = str3;
        this.zzy = str4;
    }

    public final String zza() {
        return "createUserWithEmailAndPassword";
    }

    public final void zzb() {
        h zza = zzacq.zza(this.zzc, this.zzk);
        ((s0) this.zze).a(this.zzj, zza);
        zzb(new G0(zza));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzw, this.zzx, this.zzy, this.zzb);
    }
}
