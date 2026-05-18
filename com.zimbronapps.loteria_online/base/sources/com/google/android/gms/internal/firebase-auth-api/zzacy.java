package com.google.android.gms.internal.firebase-auth-api;

import J7.A;
import J7.I;
import K7.G0;
import K7.h;
import K7.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzacy extends zzaff {
    private final I zzv;
    private final String zzw;
    private final String zzx;

    public zzacy(I i, String str, String str2) {
        super(2);
        this.zzv = (I) t.l(i);
        this.zzw = t.f(str);
        this.zzx = str2;
    }

    public final String zza() {
        return "finalizeMfaSignIn";
    }

    public final void zzb() {
        h zza = zzacq.zza(this.zzc, this.zzk);
        A a = this.zzd;
        if (a != null && !a.b().equalsIgnoreCase(zza.b())) {
            zza(new Status(17024));
        } else {
            ((s0) this.zze).a(this.zzj, zza);
            zzb(new G0(zza));
        }
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzw, this.zzv, this.zzx, this.zzb);
    }
}
