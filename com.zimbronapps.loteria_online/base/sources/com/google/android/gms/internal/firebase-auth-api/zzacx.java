package com.google.android.gms.internal.firebase-auth-api;

import K7.K;
import K7.s0;
import android.text.TextUtils;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzacx extends zzaff {
    private final String zzv;

    public zzacx(String str) {
        super(1);
        t.g(str, "refresh token cannot be null");
        this.zzv = str;
    }

    public final String zza() {
        return "getAccessToken";
    }

    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzv);
        }
        ((s0) this.zze).a(this.zzj, this.zzd);
        zzb(K.a(this.zzj.zzc()));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzb);
    }
}
