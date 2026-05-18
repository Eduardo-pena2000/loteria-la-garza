package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzacw extends zzaff {
    private final String zzv;
    private final String zzw;

    public zzacw(String str, String str2) {
        super(3);
        t.g(str, "email cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
    }

    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    public final void zzb() {
        zzb(new K7.t(this.zzl.zza() == null ? zzah.zzg() : (List) t.l(this.zzl.zza())));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zze(this.zzv, this.zzw, this.zzb);
    }
}
