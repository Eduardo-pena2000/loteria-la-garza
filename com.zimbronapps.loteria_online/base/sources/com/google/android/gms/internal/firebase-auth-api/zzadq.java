package com.google.android.gms.internal.firebase-auth-api;

import J7.e;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadq extends zzaff {
    private final zzahm zzv;

    public zzadq(String str, e eVar) {
        super(6);
        t.g(str, "token cannot be null or empty");
        zzahm zzahmVar = new zzahm(4);
        this.zzv = zzahmVar;
        zzahmVar.zzd(str);
        if (eVar != null) {
            zzahmVar.zza(eVar);
        }
    }

    public final String zza() {
        return "sendEmailVerification";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
