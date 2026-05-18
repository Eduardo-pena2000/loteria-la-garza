package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadn extends zzaff {
    private final zzaie zzv;

    public zzadn(String str, String str2, String str3, String str4) {
        super(15);
        this.zzv = zzaie.zzg().zzd(str).zza(str2).zzc(str4).zzb(str3).zza(zzahg.zza).zza();
    }

    public final String zza() {
        return "revokeAccessToken";
    }

    public final void zzb() {
        zzb(null);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
