package com.google.android.gms.internal.firebase-auth-api;

import K7.G0;
import K7.h;
import K7.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadj extends zzaff {
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzadj(String str, String str2, String str3, String str4) {
        super(2);
        t.g(str, "email cannot be null or empty");
        t.g(str2, "password cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
        this.zzx = str3;
        this.zzy = str4;
    }

    public final String zza() {
        return "reauthenticateWithEmailPasswordWithData";
    }

    public final void zzb() {
        h zza = zzacq.zza(this.zzc, this.zzk);
        if (!this.zzd.b().equalsIgnoreCase(zza.b())) {
            zza(new Status(17024));
        } else {
            ((s0) this.zze).a(this.zzj, zza);
            zzb(new G0(zza));
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzw, this.zzx, this.zzy, this.zzb);
    }
}
