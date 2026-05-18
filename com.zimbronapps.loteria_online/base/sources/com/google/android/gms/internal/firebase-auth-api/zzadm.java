package com.google.android.gms.internal.firebase-auth-api;

import J7.O;
import K7.h;
import K7.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadm extends zzaff {
    private final zzaan zzv;

    public zzadm(O o, String str) {
        super(2);
        t.m(o, "credential cannot be null");
        o.R1(false);
        this.zzv = new zzaan(o, str);
    }

    public final String zza() {
        return "reauthenticateWithPhoneCredential";
    }

    public final void zzb() {
        h zza = zzacq.zza(this.zzc, this.zzk);
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
