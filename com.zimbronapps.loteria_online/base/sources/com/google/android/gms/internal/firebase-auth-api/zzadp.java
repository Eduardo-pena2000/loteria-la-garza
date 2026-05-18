package com.google.android.gms.internal.firebase-auth-api;

import J7.e;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadp extends zzaff {
    private final zzahm zzv;
    private final String zzw;

    public zzadp(String str, e eVar, String str2, String str3, String str4) {
        super(4);
        t.g(str, "email cannot be null or empty");
        zzahm zzahmVar = new zzahm(eVar.zza());
        this.zzv = zzahmVar;
        zzahmVar.zzb(str);
        zzahmVar.zza(eVar);
        zzahmVar.zzc(str2);
        zzahmVar.zza(str3);
        this.zzw = str4;
    }

    public final String zza() {
        return this.zzw;
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzb);
    }
}
