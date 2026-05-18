package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import n6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbu implements m {
    private final Status zza;
    private c zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final c getResponse() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(c cVar) {
        this.zzb = cVar;
        this.zza = Status.f;
    }
}
