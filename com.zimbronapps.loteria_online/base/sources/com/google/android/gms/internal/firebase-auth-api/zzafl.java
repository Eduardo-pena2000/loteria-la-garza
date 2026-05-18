package com.google.android.gms.internal.firebase-auth-api;

import com.google.firebase.auth.b;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzafl implements zzafm {
    private final /* synthetic */ String zza;

    public zzafl(zzafh zzafhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzafhVar);
    }

    public final void zza(b.b bVar, Object... objArr) {
        bVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
