package com.google.android.gms.internal.firebase-auth-api;

import J7.O;
import com.google.firebase.auth.b;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzafi implements zzafm {
    private final /* synthetic */ O zza;

    public zzafi(zzafh zzafhVar, O o) {
        this.zza = o;
        Objects.requireNonNull(zzafhVar);
    }

    public final void zza(b.b bVar, Object... objArr) {
        bVar.onVerificationCompleted(this.zza);
    }
}
