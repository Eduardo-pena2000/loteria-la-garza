package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.b;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzafk implements zzafm {
    private final /* synthetic */ Status zza;

    public zzafk(zzafh zzafhVar, Status status) {
        this.zza = status;
        Objects.requireNonNull(zzafhVar);
    }

    public final void zza(b.b bVar, Object... objArr) {
        bVar.onVerificationFailed(zzaen.zza(this.zza));
    }
}
