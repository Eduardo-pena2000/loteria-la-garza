package com.google.android.gms.internal.firebase-auth-api;

import J7.S;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzadz extends zzaff {
    private final zzaaq zzv;

    public zzadz(S s, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, String str5, boolean z3) {
        super(8);
        t.l(s);
        t.f(str);
        this.zzv = new zzaaq(s, str, str2, j, z, z2, str3, str4, str5, z3);
    }

    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    public final void zzb() {
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
